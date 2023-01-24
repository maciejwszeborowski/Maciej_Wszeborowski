package compackage;

public class Animal {
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

    void feed() {
        weight = weight + 1;
        System.out.println(weight);
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
}
