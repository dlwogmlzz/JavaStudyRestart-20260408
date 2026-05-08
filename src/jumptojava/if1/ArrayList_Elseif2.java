package jumptojava.if1;

import java.util.ArrayList;

//"지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
public class ArrayList_Elseif2 {
    public static void main(String[] args) {
        // 카드가 확인 변수.
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else if (hasCard) {
                System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}

