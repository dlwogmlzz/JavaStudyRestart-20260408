package poly.ex.pay1;

// null object패턴
public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다ㅋㅋㅋㅋㅋ");
        return false;
    }
}
