package Marketing;
import java.util.*;
public class sales extends General.employee
{
    float tallowance(float t)
    {
    return (0.05f*t);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID : ");
        int empid=Integer.parseInt(sc.nextLine());
        System.out.print("Enter employee Name : ");
        String ename=sc.nextLine();
        System.out.print("Enter basic salary : ");
        int basic=Integer.parseInt(sc.nextLine());
        sales obj =new sales();
        float t = obj.earnings(empid,ename,basic);
        System.out.println("Total Earnings = "+t);
        System.out.println("Travelling Allowance = "+obj.tallowance(t));
    }
}