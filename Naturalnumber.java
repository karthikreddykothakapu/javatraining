import java.util.*;
class Naturalnumber
{
    public static void calculateSum(int n)
    {
        int i, sum = 0;
        for(i=1; i<=n; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("the sum is : " +sum);
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = number.nextInt();
        Naturalnumber.calculateSum(n);
    }
}