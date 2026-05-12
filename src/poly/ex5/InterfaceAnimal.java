package poly.ex5;

// 인터페이스는 특수한 클래스라고 생각하면된다.
public interface InterfaceAnimal {
    // public, abstract를 생략할 수있다.
    /*
    * Interface의 접근제어자는 모두 public이다. 여러곳에서 사용하는 목적이기때문에.
    * 빈 껍데기만. 자식이 구현 하면되는거임.
    * 순수 추상 클래스(abstract와 유사하다.)
    * */
    void sound();
    void move();
}
