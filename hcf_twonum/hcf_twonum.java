import java.util.Scanner;
public class hcf_twonum {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number: ");
      a = sc.nextInt();
      System.out.println("Enter second number: ");
      b = sc.nextInt();

      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of entered two numbers is: "+hcf);
   }
}