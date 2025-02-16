package beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    /**
     * 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
     * */
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        System.out.print(myList.stream().map(Object::toString).filter(n -> n.startsWith("1")).collect(Collectors.joining(",")));
    }
}
