public class Selection_Sort {
    public static void main(String[] args) {
        int numArray[]={3,2,6,8,9,4};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numArray.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<numArray.length;j++)
            {

                if(numArray[j]<numArray[min])
                    min=j;
            }
            int temp=numArray[min];
            numArray[min]=numArray[i];
            numArray[i]=temp;

        }
        System.out.println("Sorted array in ascending order ");
        for(int num:numArray)
            System.out.print(num+" ");

    }
}

//Time : O(n2)
//Space :O(n)
