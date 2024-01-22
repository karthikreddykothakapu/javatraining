import java.util.*;
class Twodarray
{
    public static void main(String[] args)
    {
        int size, i, j;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of 2-D array");
        size = k.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Enter the elements in tha array");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                array[i][j] = k.nextInt();
            }
        } 
        int[][] mularray = new int[size][size];
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                mularray[i][j] = array[i][j]*array[i][j];
            }
        }
        System.out.println("2-D array after squaring");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.println(mularray[i][j]);
            }
        }
    }
}