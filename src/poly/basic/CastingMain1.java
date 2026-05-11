package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();  // x001
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운 캐스팅(부모 타입 -> 자식타입)
        // 부모는 마음이 넓어서 자식을 품을수 있지만, 자식은 속이 좁아서 부모를 품을수 없다.
        // 그래서, 캐스팅을 하면 호출할 수 있다.
        Child child = (Child) poly; // x001
        child.childMethod();
    }
}
