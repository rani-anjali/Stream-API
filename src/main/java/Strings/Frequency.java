package Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2=str.split("");
            Map<String, Long> hs= Stream.of(str2)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            System.out.println(hs);

    }
}
