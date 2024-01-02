package work;

import java.util.Arrays;

import static java.util.Arrays.compare;

public class AnagramString {
    public static void main(String[] args) {
        String str1="bcda";
        String str2="abcd";
        if(areAnagram(str1, str2))
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean areAnagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            System.out.println("invalid input");
        }
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
