package beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    /**
     * Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
     * */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(list.stream().filter(e -> e % 2 == 0)
                        .map(String::valueOf).collect(Collectors.joining(",")));

    }
}
