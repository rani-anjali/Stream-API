package Strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str1= sc.nextLine();
        String[] str2=str1.split(" ");
        Stream.of(str2).forEach(i->{

            System.out.println(i);
        });
//        System.out.println(ls);

    }
}
