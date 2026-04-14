package ref;

// 참조값 메서드 전달.
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        initStudent(student1, "이재희", 15, 90);

        Student student2 = new Student(); // x002
        initStudent(student2, "이원우", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    // 메서드 호출로 참조값 전달..
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 참조값을 넘길수 있도록 메서드를 만들어서 처리
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
