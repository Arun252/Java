package Customer;

import Account.*;
import Customer.Details;

public class Customer {
    Details detail;
    Account account;
    public Customer(String name, String accno, Long contact, AccType type, int t, int principle) {
        Details obj= new Details(name, contact);
        if(AccType.SAVINGS.equals(type)) {
            Savings ob= new Savings(0, accno);
            this.account=ob;
        }
        else  if(AccType.FIXEDDEPOSIT.equals(type)) {
            FixedDp fd= new FixedDp(0, accno,t, principle);
            this.account= fd;
        }
    }
}
