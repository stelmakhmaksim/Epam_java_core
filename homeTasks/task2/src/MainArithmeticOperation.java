abstract public class MainArithmeticOperation {
    protected double num1, num2;

    MainArithmeticOperation(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    abstract protected double operation();
}
