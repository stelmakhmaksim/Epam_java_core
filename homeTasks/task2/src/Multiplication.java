public class Multiplication extends MainArithmeticOperation {

    Multiplication(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double operation() {
        return num1 * num2;
    }
}
