package work;

public class SecondLargest {
    public static void main(String[] args) {
        int array1[] = {5,4,3,2,1};
        int max=array1[0];
        int secMax=-1;
        for(int i=1;i<array1.length;i++)
        {
            if(array1[i]>max)
            {
                secMax=max;
                max=array1[i];

            }else if(array1[i]>secMax && array1[i]!=max)
            {
                secMax=array1[i];
            }
        }
        System.out.println(secMax);
    }
}
