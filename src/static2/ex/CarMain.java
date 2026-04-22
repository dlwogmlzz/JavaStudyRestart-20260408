package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        // 차가 복수개 라서 값을 누적해야 한다.
        Car car1 = new Car("Benz");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Porsche");

        Car.showTotalCars();    // 구매한 차량 수를 출력하는 static 메서드

    }
}
