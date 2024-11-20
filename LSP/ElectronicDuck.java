// Classe ElectronicDuck qui implémente également les deux interfaces, mais avec un état interne
public class ElectronicDuck implements Quackable, Swimmable {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck can't quack (it's off).");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            System.out.println("Electronic duck can't swim (it's off).");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
