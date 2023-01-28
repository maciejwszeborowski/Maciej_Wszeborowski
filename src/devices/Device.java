package devices;

import compackage.Human;
import compackage.Salleable;

public abstract class Device implements Salleable {

    public String producer;
    int yearOfProduction;
    boolean mode;

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", mode=" + mode +
                '}';

    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.device != this) {
            System.out.println("Nie posiadasz towaru do sprzedania scamerze!");
            return;
        }
        if (seller.cash < price) {
            System.out.println("Nie posiadasz odpowiednio ciężkiej walizki z kabzą!");
            return;
        }
        buyer.cash = buyer.cash - price;
        seller.cash = seller.cash + price;
        buyer.device = seller.device;
        seller.device = null;
        System.out.println("Dobito targu, urządzenie jest Twoje");
    }
}
