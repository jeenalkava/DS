public class Heap_Sort {
    public static void main(String[] args) {
        int arr[]={3,2,5,6,7};


        for(int i=(arr.length-1)/2 ; i>=0 ;i--)
        {
            heapify(arr,i,arr.length);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
    private static void heapify(int[] arr, int parentIndex, int length) {

        int leftChildIndex = (2 * parentIndex) + 1;
        int rightChildIndex = (2 * parentIndex) + 2;
        int largestIndex = parentIndex;

        if (leftChildIndex < length && arr[leftChildIndex] > arr[largestIndex]) {
            largestIndex = leftChildIndex;
        }
        if (rightChildIndex < length && arr[rightChildIndex] > arr[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        // there is a child whose value is larger than parent
        if (largestIndex != parentIndex) {
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
            heapify(arr, largestIndex, length);// heapify the node(arr[parentIndex] -- the one got replaced at child)
            // which
        }
    }
}
