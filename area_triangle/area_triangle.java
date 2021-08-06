
import java.util.Scanner;
class area_triangle
{
    public static void main(String[] args) {
        double s1, s2, s3, area, S;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Three Sides of a Triangle");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
 
        System.out.format("The Area of triangle = %.2f\n",area);
    }
}