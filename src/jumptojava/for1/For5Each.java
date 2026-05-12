package jumptojava.for1;

public class For5Each {
    public static void main(String[] args) {
        String[] numbers = {"one ", "two ", "three ", "four ", "five"};
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }

        // foreach문, 향상된 for문(type 변수명: iterate), iterate는 loop를 돌릴 객체..
        // numbers(iterate)에 사용할 수 있는 자료형은 배열이나 ArrayList등만 가능하다.
        // 그리고 변수명의 type(자료형)은 iterate객체에 포함된 자료형과 일치해야 한다.
        for (String number : numbers) {
            System.out.print(number);
        }
    }
}
