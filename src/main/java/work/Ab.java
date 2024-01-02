package work;

import java.util.ArrayList;

public class Ab {
    public static void main(String[] args) {
        String str="ababababbbbbbbbaaa";
        String result=null;
        Integer count=0;
        while(str.contains("ab"))
        {
            count++;
            result = str.replace("ab","a");
            str=result;
        }
        System.out.println(str);
        System.out.println(count);
    }
}
