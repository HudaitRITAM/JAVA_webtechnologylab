import java.util.*;
class pattern_2
{
    public static void main(String args[])
    {
        System.out.println("Enter value of n");
        int sum=1;  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Series (1! + 2! + 3! + ... + n!) : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
            sum=sum*j;
    
            if(i!=n)
            System.out.print(sum+"+");
            else if(i==n)
            System.out.print(""+sum);
            sum=1;
        }
    }
}

