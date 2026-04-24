package review.ref2;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 20, 100);
        System.out.println("student1 참조값 확인 = " + student1); // 참조값 확인
        Student student2 = createStudent("학생2", 21, 90);
        System.out.println("student2 참조값 확인 = " + student2); // 참조값 확인

        printStudent(student1);
        printStudent(student2);

//        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
//        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);
    }

    // 메서드 호출 결과를 반환한다. void빼고..
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();    // x001
        System.out.println("student 참조값 확인 = " + student); // 참조값 확인
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // x001
    }

    // 메서드 생성
    // 전달한 학생 객체의 필드 값을 읽어서 출력.
    static void printStudent(Student student){ // Student student는 참조값을 의미
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
