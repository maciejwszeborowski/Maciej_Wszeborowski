package Creatures;

import Creatures.Animal;
import Creatures.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, Double weight) {
        super(species, weight);

    }

    @Override
    public void beEaten() {
        System.out.println(species + " - O, zostałem skonsumowany.");

    }
}

