package test;

public class Mul {
    private int a;
    private int b;

    public Mul(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setValue(int a,int b) {
        this.a = a;
        this.b=b;
    }
    public int calculate() {
        return a * b;
    }
}
