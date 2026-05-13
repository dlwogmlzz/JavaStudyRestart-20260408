package poly.car0;

public class Driver {

    private K3Car k3Car;    // 기본이 null을 가진다.
    // K3Car와 Model3Car둘다 운전할수 있게 할려면...
    private Model3Car model3Car;    // model3Car추가..

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 메서드도 추가..
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void driver() {
        System.out.println("자동차를 운전합니다.");

        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAcelerator();
            k3Car.offEngine();
        } else if(model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAcelerator();
            model3Car.offEngine();
        }
    }
}
