package jumptojava.loop;

// continue - whlie문으로 돌아가기.
public class LoopMain4 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++;

            if (a % 2 == 0) {
                continue;       // 짝수인 경우 조건문으로 돌아간다.
            }
            System.out.println(a);      // 홀수만 출력한다.
        }
    }
}
