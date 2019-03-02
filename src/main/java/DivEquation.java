public class DivEquation implements ICalculable {
    public double calculate() {
        return a / b;
    }
    private double a;
    private double b;

    public DivEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
