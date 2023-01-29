package devices;

import compackage.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car extends Device implements Comparable<Car> {
    int wheels;
    int mileage;
    public String model;

    public abstract void refuel();

    @Override
    public void turnOn() {
        mode = true;
        System.out.println("samochód włączono");

    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", wheels=" + wheels +
                ", mileage=" + mileage +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
@Override
    public int compareTo(Car car) {
        if(car==null){
            return -1;
        }
        if (this.yearOfProduction>car.yearOfProduction){
            return 1;
        } if (this.yearOfProduction==car.yearOfProduction){
            return 0;
        }
        return -1;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        List<Car>sellerGarage=new ArrayList<>(Arrays.asList(seller.garage));
        if(!sellerGarage.contains(this)){
            throw new RuntimeException("Sprzedawca, nie ma fury w garażu");
        }
        int emptySpaces=0;
        for (Car car: buyer.garage
             ) {
            if(car==null){
                emptySpaces+=1;
            }
        }
        if (emptySpaces==0){
            throw new RuntimeException("Nie ma wolnych miejsc.");
        }
        if (buyer.cash < price) {
            throw new RuntimeException("Kupujący nie ma odpowiednich środków.");
        }
        for (int i=0;i<seller.garage.length;i++){
            if(this==seller.garage[i]){
                seller.garage[i]=null;
                break;
            }
        }
        for (int i=0;i<buyer.garage.length;i++){
            if(null==buyer.garage[i]){
               buyer.garage[i]=this;
                break;
            }
        }
        buyer.cash = buyer.cash - price;
        seller.cash = seller.cash + price;
        System.out.println("Dobito samochodowego targu!");
    }
}
