package compackage;

import Creatures.FarmAnimal;
import Creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        FarmAnimal laciata = new FarmAnimal("krowa", 500D);
        FarmAnimal nioska = new FarmAnimal("kura",1D);
        Pet szarik = new Pet("pies", 25D);
        System.out.println(laciata);
        laciata.feed();
        System.out.println(laciata);
        nioska.beEaten();
        System.out.println(szarik);
        szarik.feed(1.5D);
        System.out.println(szarik);

        /*   Animal mordechaj = new Animal("dzik", 200D);
        mordechaj.feed();
        mordechaj.takeForAWalk();
        for (int x = 0; x <= 10; x++) {
            mordechaj.takeForAWalk();
        }*/
//        Car challenger = new Car();
//        challenger.producer = "FSO";
//        challenger.model = "Polonez";
//        challenger.value = 15000;
//        challenger.turnOn();
////        Car rusty = new Car();
//        rusty.producer = "FSO";
//        rusty.model = "Polonez";
//        rusty.value = 15000;
//        System.out.println(challenger == rusty);
//        System.out.println(challenger);
//        System.out.println(rusty);
//        Human roman = new Human();
//        roman.setSalary(5000D);
//        System.out.println(roman);
//        Animal dzik = new Animal("dzik", 100000D);
//        System.out.println(dzik);
//        Human Janusz = new Human(); //seller
//        Human Arkadiusz = new Human();//buyer
//        Phone xiaomi = new Phone();
//        Animal pet = new  Animal("kotek", 2D);
//        Janusz.pet = pet;
//        Janusz.cash = 50000D;
//        Arkadiusz.cash = 350D;
//        System.out.println(Janusz);
//        System.out.println(Arkadiusz);
//        pet.sell(Janusz, Arkadiusz, 320D);
//        System.out.println(Janusz);
//        System.out.println(Arkadiusz);
//        xiaomi.turnOn();

//        roman.setSalary(50D);
//        roman.setCar(rusty);//roman ma za mało kaski
//        roman.setSalary(17000D);
//        roman.setCar(rusty);//roman jest bogaczem, kładzie bankroll na stół
//        roman.setSalary(10000D);
//        roman.setCar(rusty);//roman jest semi-bogaty, musi wziąc w credo
//    roman.getSalary();
//    roman.setSalary(1000D);
//    roman.getSalary();
//    roman.setSalary(10000D);
//    roman.getSalary();
    }
}