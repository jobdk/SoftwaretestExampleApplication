package model;

/**
 * Diese Klasse dient als Objekt
 */

public class Bike {
    private String color;

    public Bike(String color) {
        this.color = color;
    }

    public Bike() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
