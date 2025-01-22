package Lab6;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}

    class Truck extends Car{

    double maxWeight;
    int wheelsNum;
    public Truck(int weight, String model, char color,float speed, int wheelsNum, double maxWeight) {
        super(weight,model,color,speed);
        this.wheelsNum = wheelsNum;
        this.maxWeight=maxWeight;
    }

}
