package Bank;
import java.util.*;
public class Visual {
    public static void main(String[] args) {
        String name;
        Long number;
        int ID;
        Scanner in = new Scanner(System.in);
        System.out.println("*** Welcome to Axis Bank! ***");
        System.out.println();
        System.out.println("Please enter your user details in the give format: ");
        System.out.println("Name");
        System.out.println("Number");
        System.out.println("ID");
        name = in.next();
        number = in.nextLong();
        ID = in.nextInt();
        System.out.println();
        Axis obj = new Axis(name, number, ID);
        System.out.println("Select required operation: ");
        System.out.println("Balance");
        System.out.println("Withdrawal");
        String p = in.next();
        if (p.equals("Balance") || p.equals("balance")) {
            obj.Balance();
        } else if (p.equals("Withdraw") || p.equals("withdrawArun")) {
            System.out.println("Please enter Withdrawal amount : ");
            int a = in.nextInt();
            try {
                obj.withdraw(a);
            } catch (CustomException ex) {
                ex.display();
            }
        }
        System.out.println();
    }

}
