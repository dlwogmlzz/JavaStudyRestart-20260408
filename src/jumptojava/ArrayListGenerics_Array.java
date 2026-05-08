package jumptojava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListGenerics_Array {
    public static void main(String[] args) {
        String[] data = {"140", "156", "162"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);
    }
}
