package Lab6;

public class ParentClass {
    int number;

    public int getNumber() {
        return number;
    }

    public ParentClass (int number){
        this.number=number;
    }
}
class ChildClass extends ParentClass{

    public ChildClass(int number) {
        super(number);
    }
    public void outNumber(){
        System.out.println("Число из ParrentClass: "+ getNumber());
    }
}
abstract class Main {
    public static void main(String[] args) {

        ChildClass child = new ChildClass(17);
        child.outNumber();
    }
}

