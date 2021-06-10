public class Merge_Sort
{
    public static void main(String[] args) {
        int [] arr={3,4,6,1,2,9};
        MergeSort(arr,0,arr.length-1);
        System.out.println("Sorted array in ascending order ");
        for(int num:arr)
            System.out.print(num+" ");
    }
    public static void MergeSort(int arr[] , int l , int r)
    {
        if(l<r) {
            int m = l + (r - l) / 2;
            MergeSort(arr, l, m);
            MergeSort(arr,m + 1, r);
            Merge(arr, l, r, m);
        }

    }
    public static void Merge(int []arr , int l , int r , int m)
    {
            int n1=m-l+1;
            int n2=r-m;

            int left[]=new int[n1];
            int right[]=new int[n2];

        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }


    }
}
