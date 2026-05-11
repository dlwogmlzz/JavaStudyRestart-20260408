package poly.ex4;

public class Dog extends AbstractAnimal {

    // 추상메서드를 자식(Dog)이 구현함.
    @Override
    public void sound() {
        System.out.println("왕왕");
    }

    @Override
    public void move() {
        System.out.println("개 이동.");
    }
}
