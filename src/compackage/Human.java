package compackage;

import devices.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Human {
    Animal pet;
    private Car car;

    private Double salary;
    private List<Rekord> logi = new ArrayList<>();

    public Car getCar() {
        return car;
    }

    public Double getSalary() {
        logi.add(new Rekord(LocalDateTime.now(), salary));
        System.out.println(logi);
        return salary;
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            this.car = car;
            System.out.println("Masz pappy - furka  kupiona");

        } else if (salary > car.value / 12) {
            this.car = car;
            System.out.println("Unlucko, bierzemy w zeszyt");

        } else {
            System.out.println("Nie stać cie lamo, wracaj do szkoły!");
        }
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
                ", car=" + car +
                ", salary=" + salary +
                ", logi=" + logi +
                '}';
    }
}
