package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cube {
    public static void main(String[] args) {
        List<Integer> cube=Arrays.asList(2,4,3,25);
        List newCube=cube.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
        System.out.println(newCube);
    }
}
