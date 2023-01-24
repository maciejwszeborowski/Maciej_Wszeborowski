package compackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Human {
    Animal pet;
    Car car;
    private Double salary;
    private List<Rekord> logi = new ArrayList<>();
    public Double getSalary() {
        logi.add(new Rekord(LocalDateTime.now(), salary));
        System.out.println(logi);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary >= 0) {this.salary = salary;
        System.out.println("Nowe dane zostały wysłane do systemu ksiąg!");
        System.out.println("Trzeba odebrać aneks od Hanki z ksiąg");
        System.out.println("Zus już wie, masz przekichane i sie nie ukryjesz!");

        }
        else System.out.println("Hola, hola, wypłata ujemna");

    }
}
