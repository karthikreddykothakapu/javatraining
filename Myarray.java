import java.util.*;
class Myarray
{
    public static void main(String[] args)
    {
    int i , size;
    int[] array = {10,56,56,2,34,56,45,89};
    int n = array.length;
    int[] displayarray = new int[n];
    for(i=0;i<n;i++)
    {
        displayarray[i] = array[i];
    }
    System.out.println("Displaying the array");
    for(i=0;i<n;i++)
    {
        System.out.println(displayarray[i]);
    }
    }    
}