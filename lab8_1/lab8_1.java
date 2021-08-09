import java.util.*;
abstract class student {
    int roll, reg;
    student(int roll, int reg) 
    {
        this.roll = roll;
        this.reg = reg;
    }
    abstract void course();
}
class Kiitian extends student 
{
    public Kiitian(int roll, int reg)
    {
        super(roll, reg);
    }
    void course() {
        System.out.println("Roll  is: " + roll);
        System.out.println("Reg is: " + reg);
    }
}
public class lab8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll and registration no: ");
        int roll = sc.nextInt();
        int reg = sc.nextInt();
        student stud = new Kiitian(roll, reg);
        stud.course();
    }
}