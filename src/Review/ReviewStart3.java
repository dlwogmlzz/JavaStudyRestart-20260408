package Review;

public class ReviewStart3 {

    public static void main(String[] args) {
        // 학생을 실제 메모리에 만든다, 객체생성
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 10;
        student1.grade = 100;

        // 학생2...
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 12;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);


    }
}
