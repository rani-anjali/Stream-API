package work;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {
        int arr[]={10,20,30,4};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(n->System.out.print(n+" "));

    }
}
