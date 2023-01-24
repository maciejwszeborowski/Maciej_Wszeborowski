package compackage;

public class Main {
    public static void main(String[] args) {
     /*   Animal mordechaj = new Animal("dzik", 200D);
        mordechaj.feed();
        mordechaj.takeForAWalk();
        for (int x = 0; x <= 10; x++) {
            mordechaj.takeForAWalk();
        }*/
        Car rusty = new Car();
        rusty.producer = "FSO";
        rusty.model = "Polonez";
        rusty.value = 15000;
        Human roman = new Human();
        roman.setSalary(50D);
        roman.setCar(rusty);//roman ma za mało kaski
        roman.setSalary(17000D);
        roman.setCar(rusty);//roman jest bogaczem, kładzie bankroll na stół
        roman.setSalary(10000D);
        roman.setCar(rusty);//roman jest semi-bogaty, musi wziąc w credo
//    roman.getSalary();
//    roman.setSalary(1000D);
//    roman.getSalary();
//    roman.setSalary(10000D);
//    roman.getSalary();
    }
}