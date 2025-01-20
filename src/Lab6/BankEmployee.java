package Lab6;

public class BankEmployee  extends Person {
    private String bankName;
    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Работник банка: " + bankName);
    }
}
