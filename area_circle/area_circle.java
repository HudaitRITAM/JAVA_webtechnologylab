import java.util.Scanner;
public class area_circle {
   public static void main(String args[]){    
      double area,radius;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle ::");
      radius = sc.nextDouble();
      area = (radius*radius)*Math.PI;
      System.out.println("Area of the circle is ::"+area);
   }
}