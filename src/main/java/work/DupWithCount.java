package work;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupWithCount {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("AA");
        ls.add("AA");
        Map mp=ls.stream().filter(x->Collections.frequency(ls,x)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);
    }
}
