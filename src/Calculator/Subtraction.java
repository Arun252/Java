package Calculator;

class Subtraction extends Operations {
    public Subtraction(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    public int diff() {
        int diff;
        if (getA() > getB()) {
            diff= getA() - getB();
        }
        else {
            diff= getB()-getA();
        }
        return diff;
    }

    @Override
    public void display() {
        System.out.println("Difference of two Numbers is: " + diff());
    }
}
