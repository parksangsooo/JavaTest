package example;

import java.util.ArrayList;

public class UserApp {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new Staff("master", "m7788", "운영자", 3500000));
        users.add(new Customer("jung-ws", "j1357913579", "정우성", 1000));
        users.add(new Customer("LeeHR", "a123!!", "이효리", 2500));
        users.add(new Customer("ms-park", "y2345", "박명수", 1200));

        System.out.println("------------------------------ 회원+운영자 전체리스트 -----------------------------------");

        int totalAnnualSalary = 0;
        for(User user : users){
        	if (user instanceof Staff) {
        		totalAnnualSalary += ((Staff) user).getSalary();
        	}
        	System.out.printf("%d. ", user.userNo);
            user.showInfo();
        }
        System.out.println();
        System.out.printf("운영진의 연봉의 합계는 %,d입니다.%n", totalAnnualSalary);
    }
}
