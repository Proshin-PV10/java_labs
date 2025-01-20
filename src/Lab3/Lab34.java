package Lab3;

class Tree{
    String name;
    int old;
    boolean alive;
    Tree() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Пустой конструктор без параметров сработал");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
    Tree(String name,int old,boolean alive) {
        this.name = name;
        this.old = old;
        this.alive = alive;
    }
    Tree(String name,int old) {
        this.name = name;
        this.old = old;
        this.alive=true;
    }
    public void PrintInfo(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Название дерева: " + name);
        System.out.println("Возраст: " + old);
        System.out.println("Живой: " + (alive ? "Да" : "Нет"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

    }
}

class Program3 {
    public static void main(String[] args) {

        Tree tree1 = new Tree();
        Tree tree2=new Tree("Дуб",193);
        Tree tree3=new Tree("Тополь",74,false);
        tree2.PrintInfo();
        tree3.PrintInfo();
    }
}

