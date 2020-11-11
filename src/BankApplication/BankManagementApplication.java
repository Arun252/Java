package BankApplication;

import Account.Account;

import java.util.Map;
import java.util.Scanner;
import Account.*;
import Customer.*;

public class BankManagementApplication {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char o= '\0';
        System.out.println("Welcome to XYZ Bank: ");
        System.out.println();
        System.out.println("Please enter your details in the given format: ");
        System.out.println("Name: ");
        System.out.println("Account no: ");
        System.out.println("Contact no: ");
        System.out.println("Account type: ");
        System.out.println();
        int time = 0;
        int p = 0;
        String n= in.next();
        String a= in.next();
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

            }
        Customer obj = new Customer(n,a,c,t,time,p);

//        do {
//            System.out.println();
//            System.out.println("Enter your option: ");
//            o= in.next().charAt(0);
//            System.out.println();
//            switch(o)
//            {
//                case 'A':
//                    obj.balance();
//                    break;
//                case 'B':
//                    System.out.println("Please enter an amount to deposit: ");
//                    int d= in.nextInt();
//                    System.out.println();
//                    try {
//                        obj.deposit(d);
//                    } catch(CustomException e) {
//
//                    }
//                    break;
//                case 'C':
//                    System.out.println("Please enter an amount to withdraw: ");
//                    int w= in.nextInt();
//                    System.out.println();
//                    try {
//                        obj.withdraw(w);
//                    } catch(CustomException e) {
//                        System.out.println(e.toString()); // Ask why it does to return anything.
//                    }
//                    break;
//                case 'D':
//                    obj.transaction();
//                    break;
//                case 'E':
//                    System.out.println("Thank you");
//                    break;
//            }
//        }
//        while(o!='E');
//
    }
}
