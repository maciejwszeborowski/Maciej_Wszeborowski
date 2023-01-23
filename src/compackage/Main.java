package compackage;

public class Main {
    public static void main(String[] args) {
        Animal mordechaj = new Animal("dzik", 200D);
        mordechaj.feed();
        mordechaj.takeForAWalk();
        for (int x = 0; x <= 10; x++) {
            mordechaj.takeForAWalk();
        }
    }
}