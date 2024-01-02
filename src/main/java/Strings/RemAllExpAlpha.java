package Strings;

import java.util.Scanner;

public class RemAllExpAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
    }
}
