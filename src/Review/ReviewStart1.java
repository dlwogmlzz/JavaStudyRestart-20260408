package Review;

public class ReviewStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 10;
        int student1Grade = 100;

        String student2Name = "학생2";
        int student2Age = 12;
        int student2Grade = 80;

        // 학생 한명을 더 추가하기 위해서는 또 추가하고 번거롭다...
        // 그래서 배열을 이용한다.

        System.out.println("이름: " + student1Name + ", 나이: " + student1Age + ", 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + ", 나이: " + student2Age + ", 성적: " + student2Grade);
    }
}
