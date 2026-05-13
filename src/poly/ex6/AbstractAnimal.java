package poly.ex6;

public abstract class AbstractAnimal {

    public abstract void sound();       // 구현해야 됨.

    public void move() {                    // 상속해야됨.
        System.out.println("동물이 이동합니다.");
    }
}
