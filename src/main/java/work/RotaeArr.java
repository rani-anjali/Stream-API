package work;

//import static java.util.Collections.swap;

public class RotaeArr {
    public static void main(String[] args) {
        int arr[]={1,2};
        int n= arr.length;
        int k=1;
        reverse(arr,k,n-1);
        reverse(arr,0,k-1);
        reverse(arr,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverse(int arr[], int start, int end)
    {
        while(start<end) {
            swap(arr , start , end);
            start++;
            end--;
        }
        return arr;
    }
    public  static void swap(int arr[], int start, int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
