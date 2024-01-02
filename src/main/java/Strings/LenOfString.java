package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LenOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] str2 = str.split("");
        int count=0;
        for(int i=0;i<str2.length;i++)
        {
            count++;
        }
        System.out.println(count);
    }
}
