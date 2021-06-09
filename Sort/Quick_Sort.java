public class Quick_Sort {
    public static void main(String[] args) {
        int numArray[]={3,2,6,8,9,4};

        QuickSort(numArray,0,numArray.length-1);
        System.out.println("Sorted array in ascending order ");
        for(int num:numArray)
            System.out.print(num+" ");
    }
    public static int Partition(int arr[],int start,int end)
    {
        int temp;
        int pivot=arr[end];
        int pindex=start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                temp=arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;
                pindex++;
            }


        }
        temp=arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=temp;

        return pindex;
    }
    public static void QuickSort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int partition=Partition(arr,start,end);
            QuickSort(arr,start,partition-1);
            QuickSort(arr,partition+1,end);

        }
    }
}


Time : Best n(logn)
Space :O(1)
