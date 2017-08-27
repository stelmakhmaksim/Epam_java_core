/*
ДЗ простое - продолжаем делать калькулятор. Теперь он работает в диалоговом режиме.
При запуска выдает приглашение “Привет, я калькулятор“, дает на выбор дейсвтия, которые он может совершить:
1 - сложение
2 - вычитание
3 - умножение
4 - деление
5 - выход
После того, как пользователь выбрал действие, калькулятор просит ввести последовательно два числа,
выполяет действие и выводит результат псевдографикой.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void decor() {
        System.out.println("------------------------------------------------------");
        System.out.println("Hello! I'm calculator!");
        System.out.println("Please select the operation which you want to perform.");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("5 - exit");
        System.out.print("You are entering number: ");
    }

    public static boolean operSelect(int item) {
        switch (item) {
            case 1:
                System.out.println("Your choise is addition (+).");
                return true;
            case 2:
                System.out.println("Your choise is subtraction (-). ");
                return true;
            case 3:
                System.out.println("Your choise is multiplication (*).");
                return true;
            case 4:
                System.out.println("Your choise is division (/).");
                return true;
            case 5:
                System.out.print("Your choice is exit.\nThank you for using our application!\nBye bye! See you later!");
                System.exit(0);
            default:
                System.out.println("This menu item does not exist.\nPlease enter a valid number.");
                return false;
        }
    }

    public static double operExe(int item, double num1, double num2) {
        String str = new String("Result of calculation: ");
        double res = 0;
        switch (item) {
            case 1:
                Addition ad = new Addition(num1, num2);
                res = ad.operation();
                System.out.println(str + num1 + " + " + num2 + " = " + res);
                return res;
            case 2:
                Subtraction sub = new Subtraction(num1, num2);
                res = sub.operation();
                System.out.println(str + num1 + " - " + num2 + " = " + res);
                return res;
            case 3:
                Multiplication mul = new Multiplication(num1, num2);
                res = mul.operation();
                System.out.println(str + num1 + " * " + num2 + " = " + res);
                return res;
            case 4:
                Division div = new Division(num1, num2);
                res = div.operation();
                System.out.println(str + num1 + " / " + num2 + " = " + res);
                return res;
            default:
                return res;
        }
    }

    public static boolean checkItem() {
        sc = new Scanner(System.in);
        try {
            item = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input format.\nPlease enter symbol from 1 to 6.");
            return false;
        }
        return true;
    }

    public static boolean checkNumber() {
        try {
            System.out.print("First number:");
            sc = new Scanner(System.in);
            num1 = sc.nextDouble();
            System.out.print("Second number:");
            num2 = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nIncorrect input format.\nPlease enter numbers which are separated by a dot.");
            return false;
        }
        return true;
    }

    public static void clearScr() {//clear console doesn't work yet
        System.out.println("Enter 0 to clear screen or any symbol to continue.");
        sc.next();
         /*if (sc.next().equals(0)) {
            try {
                Runtime.getRuntime().exec("cls");
            } catch (Exception e) {
                System.out.println(e);
            }
        }*/
    }

    static Scanner sc;
    static int item;
    static double num1, num2;

    public static void main(String[] args) {

        do {
            decor();
            do {
                do {
                    if (checkItem())
                        break;
                } while (true);
                if (operSelect(item))
                    break;
            } while (true);
            System.out.println("Please enter two numbers.");
            do {
                if (checkNumber())
                    break;
            } while (true);
            double res = operExe(item, num1, num2);
            StarSymbols ss = new StarSymbols();
            ss.printText(Double.toString(res));
            clearScr(); //clear screen doesn't work yet
        } while (true);
    }
}