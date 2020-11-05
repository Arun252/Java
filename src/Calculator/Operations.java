package Calculator;

abstract class Operations {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a=a;
    }
    public void setB(int b) {
        this.b=b;
    }
    public abstract void display();
}

