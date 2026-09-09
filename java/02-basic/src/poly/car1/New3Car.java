package poly.car1;

public class New3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("New3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("New3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("New3Car.pressAccelerator");
    }
}