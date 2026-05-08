package jumptojava;

public class ArrayListJoin3 {
    public static void main(String[] args) {
        String[] pitches = new String[]{"140", "156", "162"};
        String result = String.join(", ", pitches);
        System.out.println(result);     // 140, 156, 162 출력.
    }
}
