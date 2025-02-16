package collectors.practice;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,20).boxed().toList();
        /**
         * 1. Partition numbers into even and odd; count the occurrence
         * using a downstream collector can reduce memory consumption or perform additional processing on each partition.
         * For example, counting elements instead of collecting them into a list reduces memory usage
         * */
        Map<Boolean, Long> parityMap = numbers.stream()
                .collect(partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.counting()
                ));
        System.out.println("Even numbers: "+ parityMap.get(true));
        System.out.println("Odd numbers: "+ parityMap.get(false));

        /**
         * Combining partitioningBy() with Multiple Operations
         * Partition numbers into even and odd, then find the maximum value in each partition
         * */

        Map<Boolean, Optional<Integer>> maxParityMap = numbers.stream().
                collect(partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.maxBy(Integer::compareTo)
                ));
        System.out.println("Max Even numbers: "+ maxParityMap.get(true).orElse(null));
        System.out.println("Max odd numbers: "+ maxParityMap.get(false).orElse(null));
    }
}
