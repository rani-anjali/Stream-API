package work;

public class RotateArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n= arr.length;
        int k=1;
        int temp[]=new int[n];
        int j=0;
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        for(int i=k;i<n;i++)
        {
            temp[j]=arr[i];
            System.out.print(temp[j]+" ");
            j++;
        }
        for(int i=0;i<k;i++)
        {
            temp[j]=arr[i];
            System.out.print(temp[j]+" ");
            j++;

        }

    }
}
