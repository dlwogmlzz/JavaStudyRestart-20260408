package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);           // this생략가능(this는 내타입에서)
        System.out.println("super.value = " + super.value);     // super는 부모타입에서

        this.hello();       // this생략가능.
        super.hello();
    }
}
