package example;

public class Customer extends User {
    private int point;

    public Customer() {
        super();
    }

    public Customer(String id, String pw, String name, int point) {
        super(id, pw, name);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return String.format("아이디: %s \t비번: %-10s \t이름: %s \t포인트: %,d", id, pw, name, point);
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
    }