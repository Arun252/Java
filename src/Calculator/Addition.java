package Calculator;

class Addition extends Operations {
    public Addition(int a, int b) {
        this.setA(a);
        this.setB(b);
    }
    public int sum() {
        int sum= getA() + getB();
        return sum;
    }

    @Override
    public void display() {
        System.out.println("Sum of two number is : " + sum());
    }
}