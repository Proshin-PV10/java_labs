package Lab6;

public class Client extends Person {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Клиент Банка: " + bankName);
    }
}
