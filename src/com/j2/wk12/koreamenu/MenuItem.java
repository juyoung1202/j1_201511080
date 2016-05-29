package com.j2.wk12.koreamenu;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian; 
    double price;
 
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}