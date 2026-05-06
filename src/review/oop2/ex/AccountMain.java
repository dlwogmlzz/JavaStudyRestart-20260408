package review.oop2.ex;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000);
        account.widthdraw(8000);
        account.widthdraw(3000); // 잔액 부족 에러
        System.out.println("잔액: " + account.balance);
    }
}
