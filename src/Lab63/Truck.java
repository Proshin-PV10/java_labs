package Lab63;

public class Truck extends Car{

    double maxWeight;
    int wheelsNum;
    public Truck(int weight, String model, char color,float speed, int wheelsNum, double maxWeight) {
        super(weight,model,color,speed);
        this.wheelsNum = wheelsNum;
        this.maxWeight=maxWeight;
    }
}
