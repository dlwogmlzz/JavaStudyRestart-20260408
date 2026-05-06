package review.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        // 객체 생성이 반복이됌　→　생성자를 생성해서 처리
        MemberInit member1 = new MemberInit();
        InitMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        InitMember(member2, "user2", 16, 100);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
    // 생성자
    static void InitMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
