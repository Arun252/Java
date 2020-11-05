package Calculator;

class Division extends Operations {
    public Division(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    public float div() {
        float div;
        if (getA() > getB()) {
            div= getA()/getB();
        }
        else {
            div= getB()/getA();
        }
        return div;
    }

    @Override
    public void display() {
        System.out.println("Division of two Numbers is: " + div());
    }
}
