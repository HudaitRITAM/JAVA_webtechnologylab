import java.util.*;
class increase_val_num{
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        int num;
        System.out.print("Enter A Number");
        num=myobj.nextInt();
        if (num>=500)
        {
            System.out.print(+(num+50));
        }
        else if (num>=400)
        {
            System.out.print(+(num+40));
        }
        else if (num>=300)
        {
            System.out.print(+(num+30));
        }
        else if (num>=200)
        {
            System.out.print(+(num+20));
        }
        else if (num>=100)
        {
            System.out.print(+(num+10));
        }
        else if (num>=50)
        {
            System.out.print(+(num+5));
        }
        else 
        {
            System.out.print(+(num));
        }
    }
}