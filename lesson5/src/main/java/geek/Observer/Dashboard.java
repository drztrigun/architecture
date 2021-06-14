package geek.Observer;

import geek.Notifier.NotifierClient;

public class Dashboard implements Observer {

    private NotifierClient notifierClient;
    private int speed;           // скорость
    private int rpm;             // обороты двигателя
    private double consumption;  // расход топлива

    public Dashboard(NotifierClient notifierClient){
        this.notifierClient = notifierClient;
        notifierClient.addObserver(this);   // регистрируем приборную панель в качестве наблюдателя
    }

    @Override
    public void update(int speed, int rpm, double consumption) {
        this.speed = speed;
        this.rpm = rpm;
        this.consumption = consumption;
        show();
    }

    // отображение на приборной панели информации
    public void show(){
        System.out.println("Speed = " + speed + ", RPM = " + rpm +  ", consumption fuel = " + consumption);
    }
}
