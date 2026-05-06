package review.oop2.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
    }

    void widthdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
