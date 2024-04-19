package example;

public class Staff extends User {

    private int salary;

    public Staff() {
        super();
    }

    public Staff(String id, String pw, String name, int salary) {
        super(id, pw, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("아이디: %s \t비번: %s \t\t이름: %s \t월급: %,d", id, pw, name, getSalary());
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
}