package jumptojava.if1;

// 만약 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라.
public class If2 {
    public static void main(String[] args) {
        int money = 4000;
        // 카드 추가
        boolean hasCard = true;

        if (money >= 3000 || hasCard) {
            System.out.println("택시타고가기!");
        } else {
            System.out.println("걸어가기!");
        }
    }
}
