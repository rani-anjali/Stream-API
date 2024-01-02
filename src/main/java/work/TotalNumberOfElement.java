package work;

import java.util.ArrayList;
import java.util.List;

public class TotalNumberOfElement {
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
        System.out.println(l1.stream().count());
    }
}
