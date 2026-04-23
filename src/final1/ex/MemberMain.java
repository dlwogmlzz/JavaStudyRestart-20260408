package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Lee");
        member.print();
        member.changeData("myId2", "Kim"); // 이름변경은 final때문에 안됌.
        member.print();
    }
}
