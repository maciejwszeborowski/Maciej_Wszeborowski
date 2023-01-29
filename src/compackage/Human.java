package compackage;

import Creatures.Animal;
import devices.Car;
import devices.CarComparator;
import devices.Device;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;

public class Human {
    public Animal pet;
    public Device device;


    public Car[] garage;
    static final Integer defaultCarAmount = 12;

    private Double salary;
    private List<Rekord> logi = new ArrayList<>();

    public Double cash;

    public Human () {
       garage=new Car[defaultCarAmount];
    }
    public Human (int garageSize){
        garage = new Car[garageSize];
    }
    public Car getCar(int parkingSpotNumber) {
        return garage[parkingSpotNumber];
    }

    public Double getSalary() {
        logi.add(new Rekord(LocalDateTime.now(), salary));
        System.out.println(logi);
        return salary;
    }

    public void setCar(Car car, int parkingSpotNumber) {
        if (salary > car.value) {
            this.garage[parkingSpotNumber] = car;
            System.out.println("Masz pappy - furka  kupiona");

        } else if (salary > car.value / 12) {
            this.garage[parkingSpotNumber] = car;
            System.out.println("Unlucko, bierzemy w zeszyt");

        } else {
            System.out.println("Nie stać cie lamo, wracaj do szkoły!");
        }
    }
public Double sumValue(){
        Double suma=0D;
    for (Car xd:garage
         ) {
        suma+=xd.value;
    }
    return suma;
}
public void sortByYearOfProduction(){
    Arrays.sort(garage,Comparator.nullsLast(new CarComparator()));
}
    public void setSalary(Double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Nowe dane zostały wysłane do systemu ksiąg!");
            System.out.println("Trzeba odebrać aneks od Hanki z ksiąg");
            System.out.println("Zus już wie, masz przekichane i sie nie ukryjesz!");

        } else System.out.println("Hola, hola, wypłata ujemna");

    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", salary=" + salary +
                ", logi=" + logi +
                '}';
    }
}
