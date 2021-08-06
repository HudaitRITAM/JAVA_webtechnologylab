
import java.util.Scanner;
 
 class biodata
{
      public static void main(String args[])
      {
          String name,branch;
          int roll;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Branch: ");
          branch=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
           
          System.out.println("Roll Number:" + roll +"\tName: "+name+"\tBranch:"+branch);
            
      }
          
}
