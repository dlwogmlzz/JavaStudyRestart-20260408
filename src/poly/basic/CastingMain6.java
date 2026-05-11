package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    // 어떤 인스턴스가 들어있는지 확인.
    private static void call(Parent parent) {
        parent.parentMethod();

        // parent가 Child인지 확인.
        // 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈수 있는지 확인한다.
        // Child 인스턴스인 경우 childMethod() 실행.
        if (parent instanceof Child child) {    // Java16부터 child변수 선언이 가능하다.
            // Child c = new parent(); // 자식은 부모를 담을 수 없다. 에러..
            System.out.println("Child 인스턴스가 맞음.");
            child.childMethod();
        }
    }
}
