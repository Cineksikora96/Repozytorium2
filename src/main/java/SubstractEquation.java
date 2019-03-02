public class SubstractEquation implements ICalculable {

    private double a;
    private double b;

    public double calculate() {
        return a - b;
    }

    public SubstractEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
