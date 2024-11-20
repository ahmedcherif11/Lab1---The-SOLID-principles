// Classe Duck qui implémente les deux interfaces Quackable et Swimmable
public class Duck implements Quackable, Swimmable {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}
