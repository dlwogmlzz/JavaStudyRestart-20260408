package review.access.b;

import review.access.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // 입금
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("잔액: " + account.getBalance());

    }
}
