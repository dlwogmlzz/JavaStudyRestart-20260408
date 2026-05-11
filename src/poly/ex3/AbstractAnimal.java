package poly.ex3;

public abstract class AbstractAnimal {
    // 추상(abstract)메서드가 하나라도 있으면 class도 추상(abstract)이어야 한다.
    // 이 추상메서드는 자식이 반드시 오버라이딩 해야 한다!!
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
