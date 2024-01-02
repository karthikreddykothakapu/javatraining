import java.util.*;
class Variable_example1
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int number1, number2, number3, sum, avg, sub, mul;
        System.out.println("Enter number1: ");
        number1 = number.nextInt();
        System.out.println("Enter number2: ");
        number2 = number.nextInt();
        System.out.println("Enter number3: ");
        number3 = number.nextInt();
        sum = number1+number2+number3;
        avg = (number1+number2+number3)/3;
        mul = number1*number2*number3;
        sub = number1-number2-number3;
        System.out.println("Sum of three numbers : " +sum);
        System.out.println("avg of three numbers : " +avg);
        System.out.println("Sub of three numbers : " +sub);
        System.out.println("mul of three numbers : " +mul);
    }
}