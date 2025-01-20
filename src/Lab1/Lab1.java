package Lab1;

import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double result1=(46+10)*(10d/3);
        System.out.println(result1);

        double result2=(29*4*(-15));
        System.out.println(result2);

        int number=10500;
        int result3=(number/10)/10;

        System.out.println(result3);
        double a=3.6;
        double b=4.1;
        double c=5.9;
        double result4=a*b*c;
        System.out.println(result4);

        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        Scanner scanner1 = new Scanner(System.in);
        int b1=scanner1.nextInt();
        if (b1 % 2!=0) {
            System.out.println("Нечетное");
        }
        else {
            if (b1 > 100) {
                System.out.println("Выход за пределы диапазона");
            }
            else {System.out.println("Четное");
            }
        }
    }
}
