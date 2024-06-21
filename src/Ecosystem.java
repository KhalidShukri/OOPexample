public class Ecosystem  {
    public static void main(String[] args) {
//        Creating an Array of animal objects(Demonstrating Ploymorphism)
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal("Lion",5,"Golden");
        animals[1] = new Dolphin("flipper",10,"Grey",20);
        animals[2] = new Bird("Eagle",3,2.1);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();

//            Using instanceOf()  to check the specific type of animal
            if (animal instanceof Mammal) {
                ( (Mammal) animal).displayInfo();

            }
            if (animal instanceof Swimmable) {
                ( (Swimmable) animal).swim();

            }
            if (animal instanceof Bird) {
                ( (Bird) animal).fly();

            }
//            Ablank line for readability
            System.out.println();

        }


    }
}
