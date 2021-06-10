package geek.repo;

import geek.Car;

public class SportCar implements Car {

    private Car car;

    public SportCar(Car car){
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return this.car.getSpeed() + 165.5;
    }

    @Override
    public double getCarrying() {
        return this.car.getCarrying() - 100.5;
    }

    @Override
    public int getPassengers() {
        return this.car.getPassengers() - 2;
    }


}
