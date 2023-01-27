package Creatures;

import compackage.Human;
import compackage.Salleable;

public abstract class Animal implements Salleable, Feedable {

    final String species;
    private Double weight;
  /*  Animal(String species, Double weight) {
        if (species=="dzik"){
            weight=200D;
        } else if (species=="pies") {
            weight=25D;

        }else {
            System.out.printf("Nie ma takiego zwierzaka");
        }
    }*/

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void feed() {
        weight = weight + 1;
        System.out.println(weight);
    }

    public void feed(double foodweight) {
        weight = weight + foodweight;
        System.out.println(foodweight);
    }

    void takeForAWalk() {
        weight = weight - 20;
        if (weight <= 0) {
            System.out.println("Zwierze kaput");
        }
        System.out.println(weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this){
            System.out.println("Nie posiadasz towaru do sprzedania scamerze!");
            return ;
        }
        if (buyer.cash<price){
            System.out.println("Nie posiadasz odpowiednio ciężkiej walizki z kabzą!");
            return;
        }
        buyer.cash = buyer.cash - price;
        seller.cash = seller.cash + price;
        buyer.pet = seller.pet;
        seller.pet = null;
        System.out.println("Dobito targu, zwierzątko jest Twoje");
    }
}
