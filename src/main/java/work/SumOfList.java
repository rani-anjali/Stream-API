package work;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10,2,3,6,19);
        List sum = Collections.singletonList(l1.stream().reduce(0, (a, b) -> (a + b)));
        System.out.println(sum);
    }
}
