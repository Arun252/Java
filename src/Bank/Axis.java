package Bank;

import static java.lang.String.*;

public class Axis extends Details {
    public Axis(String name, Long number, int ID) {
        this.setName(name);
        this.setID(ID);
        this.setNumber(number);
    }
    public void Balance() {
        if(getName().equals("Arun") && getID()==1) {
            setBalance(2000);
            System.out.println(getBalance());
        }
    }
    public void withdraw(int x) throws CustomException {
        if(getName().equals("Arun") && getID()==1)
        {
            setBalance(2000);
            if(x>getBalance()) {
                throw new CustomException("Not enough Balance");
            }
            else if(x<getBalance()) {
                setBalance(2000-x);
                System.out.println(x);
                System.out.println("Current balance is : " + getBalance());
            }
        }

    }
}
