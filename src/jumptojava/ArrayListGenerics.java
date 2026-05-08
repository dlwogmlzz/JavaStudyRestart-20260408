package jumptojava;

import java.util.ArrayList;

public class ArrayListGenerics {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        System.out.println("== 공 속도 테스트 ==");
        // 일일이 add로 추가 하는 것 보다는 배열로 한번에 할수 있음..
        pitches.add("140");
        pitches.add("156");
        pitches.add("162");

        System.out.println(pitches);
    }
}
