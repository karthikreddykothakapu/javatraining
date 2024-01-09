import java.util.*;
class Greatest
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("enter first number");
        num1 = number.nextInt();
        System.out.println("enter second number");
        num2 = number.nextInt();
        System.out.println("enter third number");
        num3 = number.nextInt(); 
        if(num1>num2 && num1>num3)
        {
            System.out.println("The greatest is :" +num1);
        }
        if(num2>num3 && num2>num3)
        {
            System.out.println("The greatest is :" +num2);
        }
        else
        {
            System.out.println("The greatest is :" +num3);
        }
    }
}