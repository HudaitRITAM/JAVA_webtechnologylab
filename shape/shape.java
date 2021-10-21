import java.util.*;
public class shape
{
	Scanner sc=new Scanner(System.in);
		float r,l,b;
	  double area;
	  void showarea()
	  {
		  System.out.println("AREA= "+area);
      }
}      
	class circle extends shape
	{
		void calculate()
		{
		System.out.println("enter the radius");
		r=sc.nextFloat();
		area=3.14*r*r;
        }
    }   
	   class rectangle extends shape
	   {
		   void cal()
		   {
			   System.out.println("enter the length and breadth");
			   l=sc.nextFloat();
			   b=sc.nextFloat();
			   area=l*b;
           }
	public static void main(String[] args)
	{
		circle c=new circle();
		c.calculate();
        c.showarea();
        rectangle re=new rectangle();
        re.cal();
        re.showarea();
	}

}