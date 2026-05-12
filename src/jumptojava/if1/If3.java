package jumptojava.if1;

import java.util.ArrayList;

public class If3 {
    public static void main(String[] args) {
        // 카드가 있는지 없는지 확인
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라.");
            
        } else if (hasCard) {
            System.out.println("택시를 타고 가라.");
        } else {
            System.out.println("걸어 가라.");
        }
    }
}
