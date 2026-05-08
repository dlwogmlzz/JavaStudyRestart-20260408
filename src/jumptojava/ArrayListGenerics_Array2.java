package jumptojava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListGenerics_Array2 {
    public static void main(String[] args) {
        // String 배열 대신 String 자료형을 여러 개 전달하여 생성 할수도 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("140", "156", "162"));
        System.out.println(pitches);
    }
}
