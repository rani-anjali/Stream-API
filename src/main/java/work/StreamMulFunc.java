package work;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMulFunc {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(3);
        l1.add(4);
        l1.add(10);
        l1.add(11);
        l1.add(33);
        l1.add(42);
        l1.add(47);
        l1.add(1);

        List<Integer> list1=l1.stream().filter(i->i%2!=0).map(i->i*i).filter(i->i%3==0).collect(Collectors.toList());
        System.out.println(list1);


    }
}
