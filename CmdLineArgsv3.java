import java.io.*;
public class CmdLineArgsv3 extends Object
{
  public static void main(String[] args)
  {
      CmdLineArgsv3 obj=new CmdLineArgsv3();
      if(args.length!=2)
      {
          System.out.println("Invalid no of arguments");
      }
      else
      {
         int x=Integer.parseInt(args[0]);
         int y=Integer.parseInt(args[1]);
         int z=x+y;
         System.out.println("The class name is - " +obj.getClass());
         System.out.println(" sum of " +x+ " and " +y+ " is " +z);
      }
  }
}
  
