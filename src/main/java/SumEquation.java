public class SumEquation implements ICalculable {

    private double a;
    private double b;

    public double calculate() {
        return a + b;
    }

    public SumEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
