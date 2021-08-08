import java.util.*;
class electricity_bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float u;
        System.out.println("Enter unit of electricity meter :");
        u=sc.nextFloat();
        if (u<=50)
        {
            System.out.println("Bill is: "+(u*2.5));
        }
        else if (u>50 && u<=100)
        {
            System.out.println("Bill is: "+(u*3.5));
        }
        else if (u>100 && u<=150)
        {
            System.out.println("Bill is: "+(u*4.5));
        }
    }
}