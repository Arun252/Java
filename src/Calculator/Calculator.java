package Calculator;
import java.util.*;

public class Calculator extends Exception{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("*** Welcome ***");
        System.out.println();
        System.out.println("Please enter two integers: ");
        int x= in.nextInt();
        int y= in.nextInt();
        Addition add= new Addition(x,y);
        Subtraction sub= new Subtraction(x,y);
        Multiplication mul= new Multiplication(x,y);
        Division div= new Division(x,y);
        System.out.println();
        String a= "Addition";
        String b= "Subtraction";
        String c= "Multiplication";
        String d= "Division";
        System.out.println("Please enter required Operation: ");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.println();
        String next= in.next();
        if(next.equals(a)) {
            add.display();
        }
        else if (next.equals(b)) {
            sub.display();
        }
        else if (next.equals(c)) {
            mul.display();
        }
        else if (next.equals(d)) {
            div.display();
        }
        else {
            System.out.println("Invalid option");
        }

        System.out.println("Thank You");
    }
}



