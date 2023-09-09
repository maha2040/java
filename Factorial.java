import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter n value between 1 to 20");
        int n=Sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"+n+"is"+fact);
    }
}
