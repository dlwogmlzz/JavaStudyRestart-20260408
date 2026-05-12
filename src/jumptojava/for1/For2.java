package jumptojava.for1;

public class For2 {
    public static void main(String[] args) {
        // 학생의 성적.
        int[] marks = {90, 100 , 82, 78, 65, 40};

        // 학생의 점수가 60점 이상이면.. 합격
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i + 1) + "번 학생은 합격입니다.");
            } else {
                System.out.println((i + 1) + "번 학생은 불합격입니다.");
            }
        }
    }
}
