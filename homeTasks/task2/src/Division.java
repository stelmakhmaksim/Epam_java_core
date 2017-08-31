public class Division extends MainArithmeticOperation {

    public Division(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double operation() {
        return getNum1() / getNum2();
    }
}