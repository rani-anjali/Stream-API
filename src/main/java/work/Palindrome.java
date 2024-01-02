package work;

public class Palindrome {
    public static void main(String[] args) {
      int n = 454;
      int temp=n;
      int r,sum=0;
      while(n>0)
      {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
        System.out.println(sum);
      if(temp==sum)
      {
          System.out.println("palindrome");
      }else{
          System.out.println("not palindrome");
      }
    }
}
