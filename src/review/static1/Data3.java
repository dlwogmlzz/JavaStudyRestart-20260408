package review.static1;

public class Data3 {
    // 멤버변수, 필드..
    public String name;          // 인스턴스 변수
    public static int count;    // static, 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
        // Data3.count++;    // static이 붙은 변수만 Data3.을 붙일수 있다.
    }
}
