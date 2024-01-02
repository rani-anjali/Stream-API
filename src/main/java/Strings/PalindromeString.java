package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverse="";
        char[] str2=str.toCharArray();
        for(int i= str2.length-1;i>=0;i--)
        {
            reverse=reverse+str2[i];
        }
        System.out.println(reverse);
        if(reverse.equals(str))
        {
            System.out.println("Its palindrome");
        }
    }
}
