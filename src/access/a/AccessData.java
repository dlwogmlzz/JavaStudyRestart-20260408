package access.a;

public class AccessData {

    public int publicFileld;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출!!" + publicFileld);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출!!" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출!!" + privateField);
    }


    // 내꺼에는 다 접근할수 있음..
    public void innerAccess() {
        System.out.println("내부 호출");
        publicFileld = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
