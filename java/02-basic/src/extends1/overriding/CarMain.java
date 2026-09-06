package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 오버라이딩

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
