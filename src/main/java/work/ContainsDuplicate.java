package work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.length);
        System.out.println(arr[0]);
        boolean flag=containsDuplicate(arr);

        System.out.println(flag);

    }
    public static boolean containsDuplicate(int arr[])
    {
        System.out.println(arr.length);
        List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        HashSet<Integer> hs=new HashSet<>(list);
        System.out.println(hs);
        if(hs.size()==list.size())
        {
            return false;
        }else {
            return true;
        }
    }
}
