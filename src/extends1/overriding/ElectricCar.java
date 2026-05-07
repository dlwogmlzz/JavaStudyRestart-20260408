package extends1.overriding;

public class ElectricCar extends Car {

    @Override   // 없어도 됨. 그런데 메서드 이름이 틀리면 빨간줄로 바로 알려줌.
    // 리턴타입까지 부모와 같이 맞춰줘야한다.
    public void move() {        // 재정의, 메서드 오버라이딩
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
