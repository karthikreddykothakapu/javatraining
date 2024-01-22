import java.util.*;
class Arraysum
{
    public static void main(String[] args)
    {
        int size, i, sum = 0, avg;
        Scanner karthik = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = karthik.nextInt();
        int[] array = new int[size];
        System.out.println("enter the array elements");
        for(i=0;i<size;i++)
        {
            array[i] = karthik.nextInt();
        }
        for(i=0;i<size;i++)
        {
            sum = array[i]+sum;
        }
        avg = sum/size;
        System.out.println("The sum of elements in array is :" +sum);
        System.out.println("The avg of elements in array is :" +avg);
    }
}