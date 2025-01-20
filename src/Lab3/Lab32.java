package Lab3;

class Car {
    public String color;
    public String name;
    public double weight;

    public Car() {
        this.color = "нет";
        this.name = "нет";
        this.weight = 700.0;
    }

    public Car(String color) {
        this.color = color;
        this.name = "Не задан";
        this.weight = 700.0;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.name = "Не задан";
        this.weight = weight;
    }

    public void CarInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Название: " + name);
        System.out.println("Вес: " + weight + " кг");
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Program1 {
    public static void main(String[] args) {

        Car car1 = new Car("Красный");
        car1.setName("Toyota");

        Car car2 = new Car("Синий", 1200.0);
        car2.setName("Mersedes");

        car1.CarInfo();
        car2.CarInfo();
    }
}



