package edu.uaslp;

import edu.uaslp.animals.Animal;
import edu.uaslp.animals.Bird;
import edu.uaslp.animals.Dog;

public class Main {
    public static void main(String[] args){
        Animal animal= new Animal();
        Bird ave= new Bird();
        Dog perro= new Dog();

        animal.setColor("Rojo");
        animal.setSize(20);
        animal.setNumberLegs(4);
        animal.eat();

        ave.setColor("Verde");
        ave.setSize(25);
        ave.setNumberLegs(2);
        ave.walk();
        ave.eat();

        perro.setColor("Amarillo");
        perro.setSize(10);
        perro.setNumberLegs(4);
        perro.walk();
        perro.eat();
    }
}
