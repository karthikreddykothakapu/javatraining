import java.util.*;
class Variable_example
{
    public static void main(String[] args)
    {
        Scanner karthik = new Scanner(System.in);
        int number1, number2;
         System.out.println("Enter number1: ");
        number1 = karthik.nextInt();

        System.out.println("Enter number2: ");
        number2 = karthik.nextInt();
        if(number1 == number2)
        {
            System.out.println("both are equal");
        }
         else
            {
                System.out.println("both are not equal");
            }
          
    }

}