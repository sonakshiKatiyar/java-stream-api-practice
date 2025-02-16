package beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice3 {
    /**
     * How to find duplicate elements in a given integers list in java using Stream functions?
     * */
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(
                myList.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
                        .entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet())
        );
    }
}
