package task1.calc;

public class Multiplication {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Wrong number of parameters!");
        } else {
            try {
                System.out.println(Double.parseDouble(args[0]) * Double.parseDouble(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Parameters of unexpected type! " + e);
            }
        }
    }
}
