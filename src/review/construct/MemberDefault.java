package review.construct;

public class MemberDefault {
    String name;

    // 기본 생성자 생성..(자동으로 생성해줌..)
    /*
    * 생성자는 반드시 호출되어야 한다.
    * 생성자가 없으면 기본 생성자가 제공된다.
    * 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다.
    * 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
    * */
    public MemberDefault() {
        System.out.println("기본생성자 호출..");
    }


}
