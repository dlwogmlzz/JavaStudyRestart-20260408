package jumptojava.for1;

public class For1 {
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three"};
        /*
        * numbers.length는 3임.
        * 그런데 Java는 0부터 0 1 2 순으로 숫자를 셈.
        * i < numbers.length;는 i < 3 즉 2까지
        *
        * */
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
