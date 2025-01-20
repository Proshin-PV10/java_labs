
public class Apartment {
    int rooms;
    double area;
    boolean hasBalcony;
    public Apartment(int rooms, double area, boolean hasBalcony){
        this.rooms=rooms;
        this.area=area;
        this.hasBalcony=hasBalcony;
    }
    public Apartment(){
        this.rooms=1;
        this.area=30;
        this.hasBalcony=false;
    }

    public int getRooms() {
        return rooms;
    }

    public double getArea() {
        return area;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}



class lab2_2 {

    public static void main(String[] args) {
        Apartment apartment1 = new Apartment();
        System.out.println("Количесво комнат:"+apartment1.rooms+", Площадь:"+apartment1.area+", Наличие балкона:"+ (apartment1.hasBalcony ? "Да" : "Нет"));
        Apartment apartment2 = new Apartment(2, 50, true);
        System.out.println("Количесво комнат:"+apartment2.rooms+", Площадь:"+apartment2.area+", Наличие балкона:"+ (apartment2.hasBalcony ? "Да" : "Нет"));
    }
}