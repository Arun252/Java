package BankApplication;

import java.util.Scanner;

import Account.FixedDp;
import Account.Savings;
import Customer.*;
import enums.AccType;

public class BankManagementApplication {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char o= '\0';
        System.out.println("Welcome to XYZ Bank: ");
        System.out.println();
        System.out.println("Please enter your details in the given format: ");
        System.out.println("Name: ");
        System.out.println("Account no: ");
        System.out.println("Address :");
        System.out.println("Contact no: ");
        System.out.println("Account type: ");
        System.out.println();
        int time = 0;
        int p = 0;
        String n= in.next();
        String a= in.next();
        String h= in.next();
        Long c= in.nextLong();
        String b= in.next();
        AccType t =null;
            if(b.equals("SAVINGS")|| b.equals("savings")) {
                t= AccType.SAVINGS;
                System.out.println();

                System.out.println("Transactions available: ");
                System.out.println("A. Check Balance");
                System.out.println("B. Deposit cash");
                System.out.println("C. Withdraw cash");
                System.out.println("D. Previous Transactions");
                System.out.println("E. Exit");

                Customer obj = new Customer(n,a,h,c,t,time,p);
                obj.save();

                do {
                    System.out.println();
                    System.out.println("Enter your option: ");
                    o= in.next().charAt(0);
                    System.out.println();
                    switch(o)
                    {
                        case 'A':
                            ((Savings)(obj.getAccount())).balance();
                            break;
                        case 'B':
                            System.out.println("Please enter an amount to deposit: ");
                            int d= in.nextInt();
                            System.out.println();
                            try {
                                ((Savings)(obj.getAccount())).deposit(d);
                            } catch(CustomException e) {

                            }
                            break;
                        case 'C':
                            System.out.println("Please enter an amount to withdraw: ");
                            int w= in.nextInt();
                            System.out.println();
                            try {
                                ((Savings)(obj.getAccount())).withdraw(w);
                            } catch(CustomException e) {
                                System.out.println(e.toString());
                            }
                            break;
//                        case 'D':
//                            ((Savings)(obj.getAccount())).previoustransactions();
//                            break;
                        case 'E':
                            System.out.println("Thank you");
                            break;
                    }
                }
                while(o!='E');

            }
            else if(b.equals("FIXEDDEPOSIT")|| b.equals("fixed deposit")) {
                t= AccType.FIXEDDEPOSIT;
                System.out.println();
                System.out.println("Please enter period for Fixed Deposit and principle amount: ");
                time= in.nextInt();
                p= in.nextInt();

                System.out.println("Transactions available: ");
                System.out.println("A. Check Interest based on input");
                System.out.println("B. Deposit cash");
                System.out.println("E. Exit");

                Customer obj = new Customer(n,a,h,c,t,time,p);
                obj.save();

                do {
                    System.out.println();
                    System.out.println("Enter your option: ");
                    o= in.next().charAt(0);
                    System.out.println();
                    switch(o)
                    {
                        case 'A':
                            System.out.println(((FixedDp)(obj.getAccount())).simpleInterest());
                            break;
                        case 'B':
                            try {
                                ((FixedDp)(obj.getAccount())).deposit(p);
                            } catch(CustomException e) {

                            }
                            break;
                        case 'E':
                            System.out.println("Thank you");
                            break;
                    }
                }
                while(o!='E');

            }


    }
}
