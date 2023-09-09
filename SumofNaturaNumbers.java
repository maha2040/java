import java.io.*;
import java.util.*;
public class SumOfNaturalNumbers
{
    public static void main(String[]args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter integer value from 1 to 20");
        int n=Sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of first"+n+"Natural Numbers is"+sum);
    }
}
