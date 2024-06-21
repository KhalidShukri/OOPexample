public class Mammal extends  Animal{
    private String  furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    void makeSound() {
        System.out.println("The Mammal makes a Generic Sound");
    }

    public void displayMammalInfo()  {
        displayInfo();;
        System.out.println("Fur color: " + furColor);
    }

}
