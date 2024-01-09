import java.util.*;
class Sum
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int number1, number2, number3, n4, n5, sum, avg;
        System.out.println("Enter number1: ");
        number1 = number.nextInt();
        System.out.println("Enter number2: ");
        number2 = number.nextInt();
        System.out.println("Enter number3: ");
        number3 = number.nextInt();
        System.out.println("Enter number4: ");
        n4 = number.nextInt();
        System.out.println("Enter number5: ");
        n5 = number.nextInt();
        sum = number1+number2+number3+n4+n5;
        avg = (sum)/5;
        System.out.println("Sum of three numbers : " +sum);
        System.out.println("avg of three numbers : " +avg);
    }
}