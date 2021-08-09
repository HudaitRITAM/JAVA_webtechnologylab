import java.util.*;
class LessBalanceException extends Exception {
    public String toString() {
        return "amount of withdrawn is invalid";
    }
}
public class lab10_7 {
    public static void Account(int deposite, int withdraw) throws LessBalanceException {
        int min = 500;
        if (withdraw > min) {
            throw new LessBalanceException();
        }
        System.out.println("balance remaining: " + (min - withdraw));
        System.out.println("total balance: " + (min - withdraw + deposite));

    }

    public static void main(String[] args) {
        System.out.println("amount to be withdrawn and deposited enter: ");
        Scanner sc = new Scanner(System.in);
        int with = sc.nextInt();
        int dep = sc.nextInt();
        try {
            Account(dep, with);
        } catch (LessBalanceException e) {
            System.out.println(e.toString());
        }
    }
}