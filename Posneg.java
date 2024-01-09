import java.util.*;
class PosNeg
{
    public static void main(String[] args)
    {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number");
        n = num.nextInt();
        if(n>0)
        {
            System.out.println("Your number is positve");
        }
        else
        {
            System.out.println("Your number is negative");
        }
    }
}