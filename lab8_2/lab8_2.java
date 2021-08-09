import java.util.*;

interface Motor {
    int a = 8;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running");
    }
    public void consume() {
        System.out.println("Motor consumes less electricity");
    }
}
public class lab8_2 {
    public static void main(String[] args) {
        Motor obj = new WashingMachine();
        obj.run();
        obj.consume();
        System.out.println("The value of data member of Interface is: " + (obj.a));
    }
}