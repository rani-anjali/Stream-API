package work;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7, 8, 9};
        int n = arr1.length;
        int m = arr2.length;
        int s = n + m;
        int res[] = new int[s];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                if (arr1[j] < arr2[i]) {
                    res[k] = arr2[j];
                    j++;
                    k++;
                }
            }
        }
        while (i < n) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        for(int g=0;g<s;g++)
        {
            System.out.print(res[g]+" ");
        }
    }
}


