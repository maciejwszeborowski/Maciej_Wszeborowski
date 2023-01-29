package compackage;

import Creatures.FarmAnimal;
import Creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
//        Phone hujawei = new Phone();
//        ArrayList listaAppek = new ArrayList<>();
//        listaAppek.add("Kuraszapp");
//        listaAppek.add("Jaraszapp");
//        hujawei.installAnnApp("Kukurykuapp");
//        hujawei.installAnnApp("Kukurykuapp", "2.0");
//        hujawei.installAnnApp("Kukurykuapp", "2.0", "serverek.com");
//        hujawei.installAnnApp(listaAppek);
//        URL uerel = new URL("http", "serverunio.com", "Januszapp/6.9");
//        hujawei.installAnnApp(uerel);
        Diesel mustang = new Diesel();
        mustang.value=200000D;
        mustang.yearOfProduction=1969;
        Electric tesla = new Electric();
        tesla.value=230000D;
        tesla.yearOfProduction = 2020;
        LPG golfik = new LPG();
        golfik.value=15000D;
        golfik.yearOfProduction = 1990;
        Human jarek=new Human();
        jarek.cash=200000D;
        Human jerzy=new Human(17);
        jerzy.cash=150000D;
        jerzy.setSalary(12000000D);
        jerzy.setCar(tesla, 3);
        jerzy.setCar(golfik,1);
        jerzy.setCar(mustang,5);
        jerzy.sortByYearOfProduction();
        System.out.println(Arrays.toString(jerzy.garage));
//        tesla.sell(jerzy, jarek, 10000000000000000D); rzuca wyjatek
        tesla.sell(jerzy, jarek, 1000D);
        System.out.println(Arrays.toString(jarek.garage));
        System.out.println(Arrays.toString(jerzy.garage));
//        tesla.sell(jerzy, jarek, 1000D); rzuca wyjatek
        Human andrzej=new Human(1);
        andrzej.cash=150000D;
        golfik.sell(jerzy, andrzej, 1000D);
        mustang.sell(jerzy,andrzej, 1000D);


//        mustang.refuel();
//        tesla.refuel();
//        golfik.refuel();
    }
}