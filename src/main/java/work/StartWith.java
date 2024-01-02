/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/

package work;

import java.util.*;
import java.util.stream.Collectors;

public class StartWith {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(5);
        l1.add(11);
        l1.add(19);
        l1.add(9);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List newList=l1.stream().
                map(i->i+"").
                filter(i->i.startsWith("1")).
                collect(Collectors.toList());
        System.out.println(newList);


    }
}
