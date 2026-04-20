package Construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 객체를 생성함과 동시에, 한번에 생성자를 매개변수로서 부를수 있다..
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 100);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }


    }
}
