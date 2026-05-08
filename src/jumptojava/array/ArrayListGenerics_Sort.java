package jumptojava.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListGenerics_Sort {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("178", "189", "162"));
        // 오름차순 정렬(sort)
        pitches.sort(Comparator.naturalOrder());    // 내림차순은 Comparator.reverseOrder()
        System.out.println(pitches);    // 162, 178, 189 출력.
    }
}
