package Lab6;

abstract public class Person implements Info {
    String name;
    String surname;

    public Person(String name,String surname) {
        this.surname = surname;
        this.name=name;
    }
    public Person() {
        this.surname = "surname";
        this.name="name";
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

}