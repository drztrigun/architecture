package geek.repo;

import geek.Car;

public class SimpleCar  implements Car {

    private double speed = 60.0;

    private double carrying = 250.50;

    private int passengers = 4;

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public double getCarrying() {
        return this.carrying;
    }

    @Override
    public int getPassengers() {
        return this.passengers;
    }


}
