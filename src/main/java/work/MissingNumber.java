package work;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int n=arr.length;
        System.out.println(n);
        int m=arr.length+1;
        System.out.println(m);
        int ts=0;
        for(int i=0;i<n;i++)
        {
            ts=ts+arr[i];
        }
        System.out.println(ts);
        int arraySum=0;
        for(int i=1;i<=m;i++)
        {
            arraySum=arraySum+i;
        }
        System.out.println(arraySum);
        System.out.println(arraySum-ts);
    }
}
