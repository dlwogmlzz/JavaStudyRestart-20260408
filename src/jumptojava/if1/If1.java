package jumptojava.if1;

// 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라.
public class If1 {
    public static void main(String[] args) {
        int money = 4000;

        if (money >= 3000) {
            System.out.println("택시타고가기!");
        } else {
            System.out.println("걸어가기!");
        }
    }
}
