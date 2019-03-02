public class PowEquation implements ICalculable {
    public double calculate() {
        return Math.pow (n, pow);
    }
    private double n;
    private double pow;

    public PowEquation(double n, double pow) {
        this.n = n;
        this.pow = pow;
    }
}
