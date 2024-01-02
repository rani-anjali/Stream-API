package Strings;

import java.util.Scanner;

public class RemoveVow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String str1="";
//        if(str.contains("ab")){
//            str1=str.replace("ab","h");
//        }
//        System.out.println(str1);
        String str1="";
           str1=     str.replaceAll("[aeiou]","");
        System.out.println(str1);

    }
}
