package edu.uaslp.animals;

public class Animal {
    private String color;
    private int size;
    private int numberLegs;

    public void eat() {
        System.out.println("Busca comida");
        System.out.println("Atrapa comida");
        System.out.println("Engulle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int tamaño) {
        size = tamaño;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int cantidadPatas) {
        numberLegs = cantidadPatas;
    }
}
