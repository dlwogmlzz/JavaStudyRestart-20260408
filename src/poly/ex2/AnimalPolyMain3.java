package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();
        /*
        * 위에 있는 객체를 ctrl + alt + n(Inline Variable)로 new Dog... 등등을 한번에,
        * 만들어줌. 객체가 있어야됌.. 변형됨.
        *
        * */
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        // 동물이 추가되어도 변하지 않는 부분.
        for (Animal animal : animals) {
            /*
            * ctrl + alt + m으로 메서드를 한번에 만듦.
            * */
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분..
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작 ");
        animal.sound();
        System.out.println("동물 소리 테스트 종료 ");
    }
}
