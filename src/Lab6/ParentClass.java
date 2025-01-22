package Lab6;

import java.util.Scanner;

public class ParentClass {
    private int num;
    public int getNum() {
        return num;
    }

    public ParentClass(int number) {
        this.num = number;
    }
}

class ChildClass extends ParentClass {
    public ChildClass(int number) {
        super(number);
    }

    public void outNum() {
        System.out.println("Число из ParentClass: " + getNum());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение Number: ");
        int number = scanner.nextInt();
        ChildClass child = new ChildClass(number);
        child.outNum();
    }
}
