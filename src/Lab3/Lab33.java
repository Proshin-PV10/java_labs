package Lab3;

class Home {
    public int floars;
    public int year;
    public String name;

    public void setValues(String name,int floars,int year){
        this.name=name;
        this.floars=floars;
        this.year=year;

    }
    public void PrintInfo(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Название: " + name);
        System.out.println("Количество этажей: " + floars);
        System.out.println("Год постройки: " + year);
        System.out.println("Возраст дома: " + yearOld(year));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
    public int yearOld(int year){
        int old=2025-year;
        return old;
    }

}
class Program2 {
    public static void main(String[] args) {
        Home home1=new Home();
        home1.setValues("Дом 1",4,1998);
        Home home2=new Home();
        home2.setValues("Дом 2",5,2002);
        home1.PrintInfo();
        home2.PrintInfo();
    }
}