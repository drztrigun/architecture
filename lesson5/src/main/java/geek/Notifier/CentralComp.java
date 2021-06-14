package geek.Notifier;

import geek.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CentralComp implements NotifierClient {

    private List observers;    // список наблюдателей
    private int speed;
    private int rpm;
    private double consumption;

    public CentralComp(){
        observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(obs);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            Observer obs = (Observer)observers.get(i);
            obs.update(speed, rpm, consumption);
        }
    }

    // метод для изменения характеристик при движении автомобиля
    public void changeData(int speed, int rpm, double consumption){
        this.speed = speed;
        this.rpm = rpm;
        this.consumption = consumption;
        notifyObserver();    // уведомляем слушателей об изменениях
    }


}
