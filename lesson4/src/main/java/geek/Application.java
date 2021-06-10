package geek;

import geek.repo.BusCar;
import geek.repo.SimpleCar;
import geek.repo.SportCar;

public class Application {
    public static void main(String[] args) {

        Car simpleCar = new SimpleCar();
        System.out.println("Speed of simple car - " + String.valueOf(simpleCar.getSpeed()));
        System.out.println("Carrying - " + String.valueOf(simpleCar.getCarrying()));
        System.out.println("Passengers - " + String.valueOf(simpleCar.getPassengers()));

        Car sportCar = new SportCar(simpleCar);
        System.out.println("Speed of simple car - " + String.valueOf(sportCar.getSpeed()));
        System.out.println("Carrying - " + String.valueOf(sportCar.getCarrying()));
        System.out.println("Passengers - " + String.valueOf(sportCar.getPassengers()));

        Car bus = new BusCar(simpleCar);
        System.out.println("Speed of simple car - " + String.valueOf(bus.getSpeed()));
        System.out.println("Carrying - " + String.valueOf(bus.getCarrying()));
        System.out.println("Passengers - " + String.valueOf(bus.getPassengers()));

    }
}
