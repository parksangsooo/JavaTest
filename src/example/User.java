package example;

public abstract class User {
    protected String id;
    protected String pw;
    protected String name;
    protected static int lastNo = 1;
    protected int userNo;

    // 기본 생성자
    public User(){

    }

    // 모든값 초기화 하는 생성자
    public User(String id, String pw, String name) {
        this.userNo = lastNo++;
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    // getter & setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return String.format("아이디: %s,\t 비번: %s,\t 이름: %s\t", id, pw, name);
    }

   public abstract void showInfo();

}
