import java.util.*;
interface TSalary {
    void earn(double basic);
    void deduc(double basic);
    void Bon(double basic);
}
abstract class Manager implements TSalary {
    double basic, DA, HRA, PF;
    public void earn(double basic) {
        this.basic = basic;
        DA = 0.8 * basic;
        HRA = 0.15 * basic;
        double earn = basic+DA+HRA;
        System.out.println("Total earning of Substaff : " + earn);
    }
    public void deduc(double basic) {
        double PF = 0.12 * basic;
        System.out.println("Total deduction of Substaff : " + PF);
    }
}
class Substaff extends Manager {
    public void Bon(double basic) {
        double bon = 0.5 * basic;
        System.out.println("Bonus Amount of Substaff is: " + bon);
    }
}
public class lab_3 {
    public static void main(String[] args) {
        double basic;
        System.out.println("Enter the basic salary: ");
        Scanner sc = new Scanner(System.in);
        basic = sc.nextDouble();
        Substaff obj = new Substaff();
        obj.Bon(basic);
        obj.earn(basic);
        obj.deduc(basic);
    }
}