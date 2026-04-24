package review;

// ★★자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
public class ReviewStart5 {

    public static void main(String[] args) {
        ReviewStudent student1 = new ReviewStudent();
        student1.name = "배열리펙토링1";
        student1.age = 20;
        student1.grade = 100;

        ReviewStudent student2 = new ReviewStudent();
        student2.name = "배열리펙토링2";
        student2.age = 24;
        student2.grade = 90;

        // 배열을 도입해서, 관리가 편하게함.
        ReviewStudent[] students = new ReviewStudent[]{student1, student2}; // 배열리펙토링1.
//        ReviewStudent[] students = {student1, student2}; // 배열리펙토링2.

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + ", 나이:" + students[i].age + ", 성적:" + students[i].grade);
        }

        // for문 최적화
        for (int i = 0; i < students.length; i++) {
            ReviewStudent rs = students[i];
            System.out.println("이름:" + rs.name + ", 나이:" + rs.age + ", 성적:" + rs.grade);
        }

        // 향상된 for문, iter + tab
        for (ReviewStudent rs : students) {
            System.out.println("이름:" + rs.name + ", 나이:" + rs.age + ", 성적:" + rs.grade);
        }
    }
}
