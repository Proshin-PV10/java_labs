package Lab6;

import java.util.Scanner;

public class ParentClass2 {
    int age;
    public ParentClass2(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void inputAge(Scanner scanner) {
        System.out.print("Введите Ваш возраст: ");
        this.age = scanner.nextInt();
    }
}
class ChildClass2 extends ParentClass2{
    private String name;

    public ChildClass2(int Age, String name){
        super(Age);
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void inputName(Scanner scanner) {
        System.out.print("Введите Ваше имя: ");
        this.name = scanner.next();
    }
}
class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChildClass2 child = new ChildClass2(0,"");
        child.inputAge(scanner);
        child.inputName(scanner);
        System.out.println("Имя: " + child.getName());
        System.out.println("Возраст: " + child.getAge());
    }
}