import java.util.*;
class CheckArgument extends RuntimeException {
    public String toString() {
        return "invalid argument";
    }
}
public class lab0_6 {
    public static void main(String[] args) {
        int sum = 0, n;
        try {
            if (args.length < 4) {
                throw new CheckArgument();
            }
            for (int i = 0; i < args.length; i++) {
                n = Integer.parseInt(args[i]);
                sum += n * n;
            }
            System.out.println("sum : " + sum);
        } catch (CheckArgument e) {
            System.out.println(e.toString());
        }
    }
}