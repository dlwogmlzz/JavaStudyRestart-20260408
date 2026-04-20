package Construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 클래스에 생성자가 하나도 없으면 기본 생성자를 자동으로 만들어 준다.


    // 추가..
    void initMember(String name, int age, int grade) {
        /* this란??
        *  나의 멤버변수에 있는 값을 넣고 싶을때 사용하는 "this."(자기자신의 인스턴스를 참조한다, 가리킨다.)
        *  매개변수의 이름과 멤버 변수의 이름이 같은경우 this를 사용해서 둘을 명확하게 구분해야 한다.
        * */
        this.name = name; // this없이 그냥 name이라고 하면 위 매개변수의 변수가 우선순위를 가진다.
        this.age = age;
        this.grade = grade;
    }
}
