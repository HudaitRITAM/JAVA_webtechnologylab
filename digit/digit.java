import java.util.*;
class digit
{
    public static void main(String args[])
    {
        int a,x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 digit no :");
        a=sc.nextInt();
        x=a/100;a=a%100;
        y=a/10;z=a%10;
        System.out.println(" x="+ x+" y="+y+" z="+z);
    }
}