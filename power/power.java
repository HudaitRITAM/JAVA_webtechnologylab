import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers :");
        int r=1;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=1;i<=b;i++)
        {
             r*=a;
        }
        System.out.println(a+"to the power "+b+" = "+r);
    }
}