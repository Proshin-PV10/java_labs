

import java.util.Scanner;

public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int umn(int a, int b) {
        return a * b;
    }

    public int del(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
            return 0;
        }
        return a / b;
    }
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double umn(double a, double b) {
        return a * b;
    }

    public double del(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
            return 0;
        }
        return (a / b);
    }
    public long plus(long a, long b) {
        return a + b;
    }

    public long minus(long a, long b) {
        return a - b;
    }

    public long umn(long a, long b) {
        return a * b;
    }

    public long del(long a, long b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
            return 0;
        }
        return (long) (a / b);
    }

}

class Lab2 {
    public static void main(String[] args) {
        double a;
        double b;
        String operation;
        double result ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        b = scanner.nextDouble();
        System.out.println("Выберите операцию (1-сложение, 2-вычитание, 3-умножение, 4-деление):");
        operation = scanner.next();

        Calculator calculator = new Calculator();


        switch (operation) {
            case "1":
                result = calculator.plus(a, b);
                break;
            case "2":
                result = calculator.minus(a, b);
                break;
            case "3":
                result = calculator.umn(a, b);
                break;
            case "4":
                result = calculator.del(a, b);
                break;
            default:
                result=0;


        }

        System.out.println("Результат: " + result);
    }
}

