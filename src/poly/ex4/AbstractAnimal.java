package poly.ex4;

/*
* 순수 추상 클래스의 특징
* 1. 인스턴스를 생성할 수 없다.
* 2. 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
* 3. 주로 다형성을 위해 사용된다.
* */
public abstract class AbstractAnimal {
    // 추상 메서드...
    public abstract void sound();
    public abstract void move();
}
