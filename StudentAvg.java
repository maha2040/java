import java.io.*;
import java.util.*;
public class StudentAverage
{
   public static void main(String[] args)
   {
     System.out.println("Enter marks of three subjects");
     Scanner sc=new Scanner(System.in);
     int m1=sc.nextInt();
     int m2=sc.nextInt();
     int m3=sc.nextInt();
     int total=m1+m2+m3;
     float Avg=(float)total/3;
     if(Avg>=75)
     {
        System.out.println("student passed in distiction");
     }
     else if(Avg>=60 && Avg<75)
     {
        System.out.println("student passed in first class");
     }
     else if(Avg>=50 && Avg<60)
     {
        System.out.println("student passed in second class");
     }
     else if(Avg>=40 && Avg<50)
     {  
        System.out.println("student passed in second class");
     }
     else
     {
        System.out.println("student failed");
     }
  }
}
   
