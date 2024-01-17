import java.util.*;
class Increase
{
    public static boolean checkNumber(int n)
    {
        int lastdigit;
        lastdigit = n%10;
        n = n/10;
        while(n>0)
        {
            if(lastdigit < n%10)
            {
                return false;
            }
            lastdigit = n%10;
            n = n/10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = number.nextInt();
        if(checkNumber(n))
        {
            System.out.println("The number is an increasing number");
        }
        else
        {
            System.out.println("The number is not an increasing number");
        }
    }
}