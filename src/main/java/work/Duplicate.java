/*How to find duplicate elements in a given integers list in java using Stream functions?*/

package work;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
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
        HashSet<Integer> hs=new HashSet<>();
       Set newSet =l1.stream().filter(s->!hs.add(s)).collect(Collectors.toSet());
       System.out.println(newSet);
    }
}
