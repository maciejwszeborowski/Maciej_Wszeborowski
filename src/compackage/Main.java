package compackage;

import Creatures.FarmAnimal;
import Creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Phone hujawei = new Phone();
        ArrayList listaAppek = new ArrayList<>();
        listaAppek.add("Kuraszapp");
        listaAppek.add("Jaraszapp");
        hujawei.installAnnApp("Kukurykuapp");
        hujawei.installAnnApp("Kukurykuapp", "2.0");
        hujawei.installAnnApp("Kukurykuapp", "2.0", "serverek.com");
        hujawei.installAnnApp(listaAppek);
        URL uerel = new URL("http", "serverunio.com", "Januszapp/6.9");
        hujawei.installAnnApp(uerel);
        Diesel mustang = new Diesel();
        Electric tesla = new Electric();
        LPG golfik = new LPG();
        mustang.refuel();
        tesla.refuel();
        golfik.refuel();
    }
}