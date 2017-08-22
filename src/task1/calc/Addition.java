package task1.calc;

/*
Делаем четыре класса, каждый из которых отвечает за одну математическую операцию - сложение, вычитание, умножение, деление.
Каждый класс имеет метод public static void main, принимает два параметра из командной строк, возвращает результат.
Плюсом будет проверка, что количество параметров соответствует ожидаемому, параметры ожидаемого типа.
 */
public class Addition {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Wrong number of parameters!");
        } else {
            try {
                System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Parameters of unexpected type! " + e);
            }
        }
    }
}
