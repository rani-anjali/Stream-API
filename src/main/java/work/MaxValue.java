// Given a list of integers, find the maximum value element present in it using Stream functions?
package work;

import java.util.ArrayList;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(5);
        l1.add(11);
        l1.add(30);
        l1.add(9);
        l1.add(10);
        l1.add(30);
        l1.add(40);
        int maxValue=l1.stream().max(Integer::compare).get();
        System.out.println(maxValue);
    }
}
