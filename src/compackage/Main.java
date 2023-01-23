package compackage;

public class Main {
    public static void main(String[] args) {
     /*   Animal mordechaj = new Animal("dzik", 200D);
        mordechaj.feed();
        mordechaj.takeForAWalk();
        for (int x = 0; x <= 10; x++) {
            mordechaj.takeForAWalk();
        }*/
    Car rusty= new Car();
    rusty.producer="FSO";
    rusty.model="Polonez";
    Human roman = new Human();
    roman.car = rusty;
    }
}