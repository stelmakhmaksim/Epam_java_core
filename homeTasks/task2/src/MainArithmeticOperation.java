abstract public class Operation {
    protected double num1, num2;

    Operation(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    abstract protected double operation();
}
