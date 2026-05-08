package jumptojava.if1;

import java.util.ArrayList;
import java.util.Arrays;

// 만약에 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라.
public class ArrayList_if {
    public static void main(String[] args) {
        String[] data = {"paper", "handphone", "money"};
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList(data));
//        pocket.add("paper");
//        pocket.add("handphone");
//        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라.");
        } else {
            System.out.println("걸어 가라.");
        }
    }
}
