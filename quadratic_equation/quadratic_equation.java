
import java.util.*;
public class quadratic_equation
{
    public static void main(String args[])
    {
        double a, b, c;
        double root1, root2, D, sqrroot;
        System.out.println("Enter The Values");
        Scanner sc = new Scanner(System.in);
        System.out.print("A:  ");
        a = sc.nextDouble();
        System.out.print("B:  ");
        b = sc.nextDouble();
        System.out.print("C:  ");
        c = sc.nextDouble();
        System.out.println("Given quadratic equation : "+a+"x^2 + "+b+"x + "+c);
       
        if((a==0)&&(b==0)&&(c==0))
        {
            System.out.println("Enter atleast two non-zero co-efficients");
            System.exit(0);
        }
        else if(a==0 && b!=0)
            {
                root1= -c/b;
                System.out.println("The roots are:"+root1);
                System.exit(0);
            }
        else if(a==0&&b==0&&c!=0)
        {
            System.out.println("The equation has no solution");
            System.exit(0);
        }
            else
            {
       
                D = b*b - 4*a*c;
                sqrroot = Math.sqrt(D);
 
                if(D<0)
                {
                    System.out.println("Roots Are Imaginary\n");
                }
                else if(D == 0)
                {
                    System.out.println("Roots are real and equal");
                    root1 = (-b + sqrroot) / (2*a);
                    System.out.println("Roots are : "+root1);
 
                } 
                else
                {
 
                    System.out.println("Roots are real and unequal");     
                    root1 = (-b + sqrroot) / (2*a);
                    root2 = (-b - sqrroot) / (2*a);
                    System.out.println("Root 1 = " + root1 + "\n");
                    System.out.println("Root 2 = " + root2 + "\n");
                }
            }
        
        
        
}
}