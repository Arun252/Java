package Bank;

public class CustomException extends Exception {
    String s;
    CustomException(String a) {
        this.s=a;
    }
    @Override
    public String toString() {
        return ""+s;
    }
}
