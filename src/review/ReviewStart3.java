package review;

public class ReviewStart3 {

    public static void main(String[] args) {
        // ReviewStudent객체 생성.
        ReviewStudent student1; // 1. ReviewStudent타입의 변수 선언..
        student1 = new ReviewStudent(); // 2. 객체 생성, 참조값을 보관.
        //.(점,dot)키워드를 사용해서 메모리에 존재하는 객체에 접근(name, age, grade)
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        ReviewStudent student2 = new ReviewStudent();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 90;

        // 객체 생성후 참조값 확인.
        System.out.println("student1:" + student1);
        System.out.println("student2:" + student2);

        System.out.println("이름:" + student1.name + ", 나이:" + student1.age + ", 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + ", 나이:" + student2.age + ", 성적:" + student2.grade);
    }
}
