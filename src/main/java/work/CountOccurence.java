package work;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {
    public static void main(String[] args) {
        String str="aabbcaa";
        HashMap<Character, Integer> oc=new HashMap<>();
        char[] ch=str.toCharArray();
        for(char c: ch){
            if(oc.containsKey(c))
            {
                oc.put(c,oc.get(c)+1);
            }else{
                oc.put(c,1);
            }
        }
        for(Map.Entry entry: oc.entrySet())
        {
            System.out.println(entry);
        }
    }
}
