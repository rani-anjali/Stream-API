package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10, 3, 5, 12, 9);
        l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
