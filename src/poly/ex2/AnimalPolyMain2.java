package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal duck = new Duck();
        Animal[] animals = {dog, cat, caw, duck};

        // 동물이 추가되어도 변하지 않는 부분.
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작 ");
            animal.sound();
            System.out.println("동물 소리 테스트 종료 ");
        }
    }
}
