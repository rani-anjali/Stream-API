package work;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
    public static void main(String[] args) {
        String str= "abcabccab";
//        String str1[]=str.split("");
//        LinkedHashMap<String,Long> ls = Stream.of(str1)
//                .collect(Collectors.groupingBy(Function.identity(),
//                        LinkedHashMap::new, Collectors.counting()));
//        for(Map.Entry entry: ls.entrySet())
//        {
//            System.out.println(entry);
//        }
        String str1[]=str.split("");
        LinkedHashMap<String,Long> ls=Stream.of(str1)
                .collect
                        (Collectors.groupingBy(Function.identity()
                                ,LinkedHashMap::new,Collectors.counting()));
        for(Map.Entry entry: ls.entrySet())
        {
            System.out.println(entry);
        }


    }
}
