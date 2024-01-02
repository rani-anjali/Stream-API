package Strings;

import java.util.Scanner;

public class CountSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                int n=Character.getNumericValue(str.charAt(i));
                System.out.println(n);
                sum=sum+n;
            }
        }
        System.out.println(sum);

    }
}
