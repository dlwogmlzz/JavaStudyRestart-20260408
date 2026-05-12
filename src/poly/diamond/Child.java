package poly.diamond;

// 부모의 기능 두개를 다중으로 구현할 수 있다.
public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child.methodA");

    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");

    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
