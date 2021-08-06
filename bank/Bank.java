import java.util.*;
 class Account
 {
      String acc_no;
      double balance;
       public void Details()
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Account number: ");
          acc_no = sc.next();
          System.out.println("enter the balance: ");
          balance =sc.nextInt();
        }
      public void disp()
        {
          System.out.println("Account number: "+acc_no);
          System.out.println("Balance: "+balance);
        }
    }
    class person extends Account
    {
        String name;
        int aadhar_no;
        public void PerDetails()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter account holder's name: ");
            name=sc.next();
            System.out.println("aadhar number of account holders: ");
           aadhar_no=sc.nextInt();
        }
        public void disp()
        {
          System.out.println("Name of Account holder: "+name);
          System.out.println("aadhar no of account holder"+aadhar_no);
        }
        public void printDetails()
        {
            super.disp();
            disp();
        }
    }
    public class Bank
    {
        public static void main(String[] args)
        {
            person arr[]=new person[5];
            int n,i;
            Scanner sc=new Scanner(System.in);
            for(i=0;i<arr.length;i++)
            {
                arr[i]=new person();
            }
            
           System.out.println("how many details you want to input: ");
           n=sc.nextInt();
           for(i=0;i<n;i++)
           {
               arr[i].Details();
               arr[i].PerDetails();
               System.out.println();
            }
            System.out.println();
            for(i=0;i<n;i++)
            {
                arr[i].printDetails();
                System.out.println();
            }
            System.out.println();
        }
    }
        
        
        