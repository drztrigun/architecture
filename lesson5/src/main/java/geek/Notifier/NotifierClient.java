package geek.Notifier;


import geek.Observer.Observer;

public interface NotifierClient {

    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObserver();
}
