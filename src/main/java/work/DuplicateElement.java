package work;

public class DuplicateElement {
    public static void main(String[] args) {
        int array1[]={1,4,2,6,3};
        int array2[]={4,2};
        for(int i=0;i<array1.length;i++)
        {
            int element = array1[i];
            for(int j=0;j<array2.length;j++)
            {
                if(element == array2[j])
                {
                    System.out.print(element+" ");
                    array2[j]=-1;
                    break;
                }
            }
        }
    }
}
