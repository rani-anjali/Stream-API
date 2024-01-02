package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        List<String> ls= new ArrayList<>();
        ls.add("Anjali");
        ls.add("Adarsh");
        ls.add("Anjali");
        ls.add("Anjali");
        ls.add("Adarsh");
        Map<String,Long> mp=ls.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);
    }
}
