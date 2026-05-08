package jumptojava.map;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // put메서드(key와 value를 추가하는데 사용한다.)
        map.put("people", "사람");        // key, value
        map.put("baseball", "야구");     // key, value

        // get메서드(key에 해당하는 value를 얻을때 사용한다.)
        System.out.println(map.get("people"));      // 사람 출력.
        System.out.println(map.get("사람"));          // null 출력, get으로 key를 불러와야 value가 출력된다.
    }
}
