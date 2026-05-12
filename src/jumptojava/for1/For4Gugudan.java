package jumptojava.for1;

public class For4Gugudan {
    public static void main(String[] args) {
        // 2중 for문으로 구구단 만들기
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10;  j++) {
                // 삼항연산자(변수 = (조건식) ? 참일 때의 값 : 거짓일 때의 값;)
                String t = (j == 9) ? "" : ", ";
                System.out.print(i + "x" + j + " = " + i * j + t);
            }
            System.out.println();
        }
    }
}
