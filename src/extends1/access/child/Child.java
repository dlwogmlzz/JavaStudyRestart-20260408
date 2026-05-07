package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent { // 부모 상속

    public void call() {
        publicValue = 1;
        protectedValue = 1;     // 상속 관계 or 같은 패키지

        // 같은 패키지에 있어야 호출가능...
        // defaultValue = 1;      // 다른 패키지 접근 불가, 컴파일 요류
        // privateValue = 1;       // 접근 불가, 컴파일 오류

        // 호출 가능.
        publicMethod();
        protectedMethod();      // 상속 관계 or 같은 패키지
        // defaultMethod();           // 다른 패키지 접근 불가, 컴파일 오류
        // privateMethod();            // 접근 불가, 컴파일 오류

        printParent();
    }
}
