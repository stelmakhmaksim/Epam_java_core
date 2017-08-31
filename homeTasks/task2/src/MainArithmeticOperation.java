abstract public class MainArithmeticOperation {
    private double num1, num2;

    public MainArithmeticOperation(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    abstract protected double operation();

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}