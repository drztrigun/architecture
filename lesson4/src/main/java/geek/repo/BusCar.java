package geek.repo;

import geek.Car;

public class BusCar implements Car {

    private Car car;
    public BusCar(Car car){
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return this.car.getSpeed() - 10;
    }

    @Override
    public double getCarrying() {
        return this.car.getCarrying() + 350.5;
    }

    @Override
    public int getPassengers() {
        return this.car.getPassengers() + 25;
    }
}
