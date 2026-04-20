package Construct;

import java.lang.reflect.Member;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    //생성자 추가..., 생성자 오버로딩!!
    //this()의 규칙
    //this()는 생성자 코드안의 첫줄에만 작성할 수 있다.

    MemberConstruct(String name, int age) {
//        System.out.println("생성자 첫줄에 실행하면 안됌..");
        this(name, age, 60); // 변경..
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // 생성자의 이름은 클래스 이름과 동일해야 한다!! 첫글자 대문자
    // 반환타입없다. 나머지는 메서드랑 같다.

    /* ★생성자의 장점
    * ・중복 호출을 제거한다.
    * ・제약 - 생성자 호출 필수! 무조건 초기값 설정해야됌.
    * 　객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다!!
    * */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
