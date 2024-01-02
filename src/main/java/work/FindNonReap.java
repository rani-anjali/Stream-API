package work;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNonReap {

    public static void myfunc(String s)
    {
        //100loc
        System.out.println(s);
        System.out.println("ANJALI");

    }
    public static void main(String[] args) {
        String input="Java articles are Awesome"; ;
        String[] arr = input.split("");

        //Stream.of(arr).forEach((s)->System.out.println(s));


        LinkedHashMap<String, Long> collect = Stream.of(arr)
                .collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry entry:collect.entrySet())
        {
            //System.out.println(entry);
            if(entry.getValue()==Long.valueOf(1)) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
