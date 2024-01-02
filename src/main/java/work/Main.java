package work;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int k=2;
        for(int i=0;i<k;i++)
        {
            reverse(arr,0,n-1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        // System.out.println(n);
    }
    public static int[] reverse(int arr[], int start, int end)
    {
        int n=arr.length;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }return arr;
    }
    public static void swap(int arr[], int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}