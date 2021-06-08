public class BubbleSort
{
    public static void main(String[] args) {
        int numArray[]={3,2,6,8,9,4};
        for(int i=0;i<numArray.length-1;i++)
        {
            for(int j=0;j<numArray.length-1-i;j++)
            {
                if(numArray[j]>numArray[j+1])
                {
                    int temp=numArray[j];
                    numArray[j]=numArray[j+1];
                    numArray[j+1]=temp;
                }
            }

        }
        System.out.println("Sorted array in ascending order ");
        for(int num:numArray)
            System.out.print(num+" ");
    }
}

Time : Best - O(n) , Average - O(n2) , Worst O(n2)
Space :O(n)
