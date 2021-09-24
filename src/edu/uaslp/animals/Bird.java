package edu.uaslp.animals;

import edu.uaslp.reproduction.Mammal;

public class Bird extends Mammal {

    public void fly() {
        System.out.println("Mueve alas");
        System.out.println("Encoge patitas");
        System.out.println("Se eleva");
    }

    public void walk() {
        System.out.println("Da saltitos");
    }
}