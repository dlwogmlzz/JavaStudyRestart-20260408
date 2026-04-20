package access.a;

public class PublicClass {
    public static void main(String[] args) {
        // 자기 자신의 클래스 생성
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default접근제어자(같은 패키지안에서)
class DefaultClass1 {

}

class DefaultClass2 {

}
