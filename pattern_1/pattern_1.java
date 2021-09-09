import java.util.Scanner;
class pattern_1
{
    public static void main(String args[])
    {
        System.out.println("Enter value of x");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nSeries (x^1 + x^2 + x^3 + .... + x^n)");
        for(int i=1;i<=n;i++)
        {
            if(i!=n)
            System.out.print(x+"^"+i+"+ ");
            else
            System.out.print(x+"^"+i);
        }
    }
}