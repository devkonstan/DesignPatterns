package creational.builder;

public class FluentBuilder {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;


    public int getA() {
        return a;
    }

    public FluentBuilder setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public FluentBuilder setB(int b) {
        this.b = b;
        return this;
    }

    public int getC() {
        return c;
    }

    public FluentBuilder setC(int c) {
        this.c = c;
        return this;
    }

    @Override
    public String toString() {
        return "FluentBuilder{" +
                "b=" + b +
                ", c=" + c +
                '}';
    }
}
