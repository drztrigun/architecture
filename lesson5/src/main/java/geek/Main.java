package geek;

import geek.Notifier.CentralComp;
import geek.Observer.Dashboard;

public class Main {
    public static void main(String[] args) {
        CentralComp cp = new CentralComp();  //создаем центральный процессор
        Dashboard db = new Dashboard(cp);    //создаем приборную панель

        cp.changeData(10, 1800, 7.2);
        cp.changeData(30, 2100, 7.9);
        cp.changeData(60, 2500, 8.0);
    }

}
