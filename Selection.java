import java.util.*;
class Selection
{
    public static void main(String[] args)
    {
        int size, i, j, temp;
        Scanner karthik = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = karthik.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements");
        for(i=0; i<size; i++)
        {
            array[i] = karthik.nextInt();
        }
        for(i=0; i<size; i++)
        {
            for(j=i+1; j<size; j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("array elements after sorting");
        for(i=0; i<size; i++)
        {
            System.out.println(array[i]);
        }
    }
}