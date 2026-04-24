package review.ref2;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();   // x001
        initStudent(student1, "학생1", 20, 100);

        Student student2 = new Student();   // x002
        initStudent(student2, "학생2", 21, 90);

        printStudent(student1);
        printStudent(student2);

//        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
//        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);
    }

    static void initStudent(Student student, String name, int age, int grade){
        // 전달한 학생 객체의 필드에 값을 설정.
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    // 메서드 생성
    // 전달한 학생 객체의 필드 값을 읽어서 출력.
    static void printStudent(Student student){ // Student student는 참조값을 의미
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
