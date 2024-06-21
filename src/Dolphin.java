public class Dolphin extends  Mammal implements Swimmable{
    private double swimSpeed;

    public Dolphin(String name, int age, String furColor, double swimSpeed) {
        super(name, age, furColor);
        this.swimSpeed = swimSpeed;
    }

    @Override
    void makeSound() {
        System.out.println("The Dolphin Clicks and Whistles");

    }
    @Override
    public void swim() {
        System.out.println("The Dolphin Swims at a speed of " + swimSpeed + "Km/h");

    }
}
