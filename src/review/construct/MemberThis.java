package review.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 이럴 경우에 this생략 가능.., nameField에 지역변수가 없는경우, 멤버변수에서 찾게 된다.
        // 웬만하면 쓰는게 낫다.
        nameField = nameParameter;
    }
}
