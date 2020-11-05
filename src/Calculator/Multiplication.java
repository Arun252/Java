package Calculator;

class Multiplication extends Operations {
    public Multiplication(int a, int b) {
        this.setA(a);
        this.setB(b);
    }
    public int product() {
        int pro= getA()*getB();
        return pro;
    }

    @Override
    public void display() {
        System.out.println("Product of two number is : " + product());
    }
}