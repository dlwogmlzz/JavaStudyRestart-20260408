package Construct;

import java.lang.reflect.Member;


// 객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자를 이용한다.
public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);
        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 100);

        MemberInit[] members = {member1, member2};

        for (MemberInit ms : members) {
            System.out.println("이름: " + ms.name + ", 나이: " + ms.age + ", 성적: " + ms.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
