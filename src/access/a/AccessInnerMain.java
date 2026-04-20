package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능, public은 어디서든 호출 가능!!
        data.publicFileld = 1;
        data.publicMethod();

        // 같은 패키지만 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가!!!!!
        // data.privateField = 3;
        // data.privateMethod();

        // 외부에서 호출 가능!
        data.innerAccess();

    }
}
