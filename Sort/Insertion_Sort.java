public class Insertion_Sort {
    public static void main(String[] args) {
        int numArray[]={3,2,6,8,9,4};

        for(int i=1;i<numArray.length;i++)
        {
            int hole=i;
            int value=numArray[i];
            while(hole>0 && numArray[hole-1]>value)
            {
                numArray[hole]=numArray[hole-1];
                hole--;

            }
            numArray[hole]=value;
        }
        System.out.println("Sorted array in ascending order ");
        for(int num:numArray)
            System.out.print(num+" ");
    }
}

//Time : Best O(n) , avg=worst=O(n2)
//Space : O(1)
