package jumptojava.for1;

public class For3 {
    public static void main(String[] args) {
        int[] marks = {90, 100, 72, 55, 87, 40};
        for (int i = 0; i < marks.length; i++) {
            // 점수가 60점미만이면 continue를 만나서 다시 위로 올라가서 다른 학생의 점수를 확인함.
            if (marks[i] < 60) {
                // continue 바로 밑에는 실행문을 쓰면 에러가 발생한다.
                // 뒤도 돌아보지 않고 위로 다시 올라가는 점프이다.
                continue;
                // 영원히 실행되지 않는 죽은코드
                // System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");

            }
            System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
        }
    }
}
