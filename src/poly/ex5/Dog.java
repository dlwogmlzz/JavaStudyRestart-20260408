package poly.ex5;

public class Dog implements InterfaceAnimal {   // 상속과 같지만, 인터페이스는 implements 구현하다라고 함.

    @Override
    public void sound() {
        System.out.println("멍멍.");
    }

    @Override
    public void move() {
        System.out.println("개 이동.");
    }
}
