package review;

// ★★자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
public class ReviewStart4 {

    public static void main(String[] args) {
        ReviewStudent student1 = new ReviewStudent();
        student1.name = "배열도입1";
        student1.age = 20;
        student1.grade = 100;

        ReviewStudent student2 = new ReviewStudent();
        student2.name = "배열도입2";
        student2.age = 24;
        student2.grade = 90;

        // 배열을 도입해서, 관리가 편하게함.
        ReviewStudent[] students = new ReviewStudent[2]; // 배열도 new로 생성.
        students[0] = student1; // x001
        students[1] = student2; // x002

        System.out.println("이름:" + students[0].name + ", 나이:" + students[0].age + ", 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + ", 나이:" + students[1].age + ", 성적:" + students[1].grade);
    }
}
