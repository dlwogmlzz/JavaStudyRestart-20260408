package jumptojava;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();

        //제네릭스에는 Integer, Double, Member...전부 넣어야 한다.
        // ArrayList<String> pitches = new ArrayList<>();   //  제네릭스<> 사용가능.
        pitches.add(100);
        pitches.add(200);
        pitches.add(300);
        pitches.add(400);
        System.out.println(pitches);
        System.out.println("첫째 자리 숫자: " + pitches.getFirst());
        System.out.println("끝 자리 숫자: " + pitches.getLast());

        System.out.println("인덱스 1번째 자리 숫자: " + pitches.get(1));    // 0부터 시작
        System.out.println("300km는 언제 던진거야? " + pitches.indexOf(300) + "번째");
        System.out.println("pitches의 갯수: " + pitches.size());
        System.out.println("100km를 던진적이 있는지? " + pitches.contains(100));
    }
}
