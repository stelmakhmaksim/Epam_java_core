public class Subtraction extends MainArithmeticOperation {

    public Subtraction(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double operation() {
        return getNum1() - getNum2();
    }
}