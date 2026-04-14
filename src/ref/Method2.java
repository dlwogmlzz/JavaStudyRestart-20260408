package ref;

// 메서드 내부에서 인스턴스를 생성한 후에 참조값을 메서드 외부로 반환..

public class Method2 {

    public static void main(String[] args) {
        // 생성하고 초기화
        // Student student1 = new Student(); // x001
        // initStudent(student1, "이재희", 15, 90);

        // Student student2 = new Student(); // x002
        // initStudent(student2, "이원우", 16, 80);

        // 메서드 호출후 결과 반환
        Student student1 = createStudent("이재희", 15, 90);
        System.out.println("student1=" + student1);
        Student student2 = createStudent("이원우", 16, 80);
        System.out.println("student2=" + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student=" + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student; // 참조값 반환
    }

    // 참조값을 넘길수 있도록 메서드를 만들어서 처리
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
