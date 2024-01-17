import java.util.*;
class Diff
{
    int i, j, s1 = 0,s2 = 0, sum, result;
    public void difference(int n)
    {
        for(i=0; i<=n; i++)
        {
            s1 = s1+(i*i);
        }
        for(j=0; j<=n; j++)
        {
            s2 = s2+j;
        }
        sum = s2*s2;
    }
    public void result()
    {
        result = s1 - sum;
        System.out.println("the difference is : " +result);
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = number.nextInt();
        Diff obj = new Diff();
        obj.difference(n);
        obj.result();
    }
}