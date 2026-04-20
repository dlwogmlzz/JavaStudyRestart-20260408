package access.b;

import access.a.AccessData;

// class 파일은 여러개를 만들수 있지만,
// public클래스는 반드시 파일명과 이름이 같아야한다.
// 하나의 Java파일에 public 클래스는 하나만 존재할 수 있다.

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능, public은 어디서든 호출 가능!!
        data.publicFileld = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가!!!!!
        // data.privateField = 3;
        // data.privateMethod();

        // 외부에서 호출 가능!
        data.innerAccess();
    }
}
