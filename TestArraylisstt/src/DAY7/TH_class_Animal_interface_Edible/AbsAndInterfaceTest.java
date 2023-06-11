package DAY7.TH_class_Animal_interface_Edible;

import DAY7.TH_class_Animal_interface_Edible.Module.Animal;
import DAY7.TH_class_Animal_interface_Edible.Module.Chicken;
import DAY7.TH_class_Animal_interface_Edible.Module.Edible;
import DAY7.TH_class_Animal_interface_Edible.Module.Tiger;

public class AbsAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
