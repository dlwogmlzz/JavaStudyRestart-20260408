package Construct;

public class MemberThis {
    String nameField; // 필드명

    void initMember(String nameParameter) { // nameParameter - 매개변수의 이름
        nameField = nameParameter;
        // 필드명과 매개변수의 이름이 다르면 넣을수 있다, 이런경우는 앞에 "this." 가 생략되어 있다.
        // 매개변수 nameParameter를 찾는데 지역변수에 없을때, 그러면 자신의 멤버변수의 것을 가져다 쓸수있다.
        // 맴버변수를 사용할 때는 무조건 "this."을 넣어서 구분할수 있게 해주는것이 좋다?? 권장하지 않음..
        // 최근에는 this.를 잘사용안하는데, IDE에서 색깔로 구분해준다.
        // 멤버변수와 매개변수의 이름이 중복될 경우에만 "this."를 넣어주자!!
    }
}
