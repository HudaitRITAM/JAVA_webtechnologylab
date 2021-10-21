import java.util.*;
class simple_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r,s;
        System.out.println("\nEnter Principal: ");
        p=sc.nextDouble();
        System.out.println("Enter Time: ");
        t=sc.nextDouble();
        System.out.println("Enter Rate: ");
        r=sc.nextDouble();
        s=(p*t*r)/100;
        if (s>500)
        {
            System.out.println("Principle is: "+(p+500)+"\nSimple Interst is: "+s);
        }
        else 
        {
            System.out.println("\nSimple Interset is: "+s);
        }
    }
}