package work;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptystream = Stream.empty();
        String names[]={"Priya","Anj","suraj"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

    }
}
