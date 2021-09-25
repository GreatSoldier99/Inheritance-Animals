package edu.uaslp.animals;

import edu.uaslp.reproduction.Oviparous;

public class Bird extends Oviparous {

    public void fly() {
        System.out.println("Mueve alas");
        System.out.println("Encoge patitas");
        System.out.println("Se eleva");
    }

    public void walk() {
        System.out.println("Da saltitos");
    }
}