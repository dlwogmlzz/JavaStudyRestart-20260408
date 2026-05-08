package jumptojava.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListJoin2 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("140", "156", "162"));
        // String.join("구분자", 리스트 객체)를 사용해 리스트의 각 요소에 구분자를 넣어 하나의 문자열로 만들 수 있다.
        String result = String.join(", ", pitches);
        System.out.println(result);
    }
}
