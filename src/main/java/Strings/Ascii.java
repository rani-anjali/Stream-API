package Strings;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charcter");
        char c = sc.next().charAt(0);
        if(c>=97 && c<=122 || c>=65 && c<=90)
        {
            int nn=c;
            System.out.println(nn);
        }
    }
}
