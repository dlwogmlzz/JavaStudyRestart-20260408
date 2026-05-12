package jumptojava.for1;

import java.util.ArrayList;
import java.util.Arrays;

public class For6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        // 단, for each문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고,
        // 한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약이 있다.
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
