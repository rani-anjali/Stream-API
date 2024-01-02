package work;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.*;

public class ToUppercase {
    public static void main(String[] args) {
        List<String> ls=List.of("aa","bb","cc");
        ls.stream().map(i->i.toUpperCase()).forEach(System.out::println);
    }
}
