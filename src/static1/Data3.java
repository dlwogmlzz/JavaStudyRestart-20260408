package static1;

public class Data3  {
    // name, count둘다 멤버변수이다.
    public String name; // 인스턴스 변수
    /*
    * static이 붙지 않은 멤버변수는 객체를 생성해야 사용할수 있다
    * 인스턴스 변수는 인스턴스를 만들때 마다 새로 만들어진다.
    * */
    public static int count; // 메서드영역에서 관리, static변수, 클래스변수
    /*
     * static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용가능.
     * 클래스 자체에 소속되어 있어, 클래스 변수라고 한다.
     * */
    public Data3(String name) {
        this.name = name;
        count++; // Data3.count++ / 같은클래스안이라서 「Data3.」생략가능!
    }
}
