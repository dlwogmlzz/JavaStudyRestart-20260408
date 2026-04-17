package oop1.ex;

// 객체 지향 계좌
public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        // 잔액이 빼려는 돈보다 크면
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
