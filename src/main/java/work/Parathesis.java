package work;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Parathesis {
    public static boolean validParan(String str)
    {
        char[] ch=str.toCharArray();
        int n= str.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            if(ch[i]=='['|| ch[i]=='('|| ch[i]=='{'){
                stack.push(ch[i]);
            }else if(ch[i]==']'|| ch[i]=='}'|| ch[i]==')'){
                stack.pop();
            }
        }
        if(stack.empty())
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input");
        String str=sc.next();
        boolean ans = validParan(str);
        System.out.println(ans);

    }
}
