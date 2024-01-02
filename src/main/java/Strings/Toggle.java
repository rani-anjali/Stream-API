package Strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        char[] ch=str.toCharArray();
        String str1="";
        for(char ch:str.toCharArray())
        {
            if (ch>=65 && ch<=90)
            {
                ch=Character.toLowerCase(ch);
                str1=str1+ch;

            }else{
                ch=Character.toUpperCase(ch);
                str1=str1+ch;
            }
        }
        System.out.println(str1);
    }

}
