package main.glue_object;

import main.display_object.Display;

import java.io.IOException;

public abstract class Glue {

    protected String name;
    protected String type;
    protected int SizeInMillilitres;
    protected boolean adheresToPlastic;
    protected boolean adheresToWood;
    protected boolean adheresToMetal;
    protected boolean adheresToGlass;
    protected boolean adheresToPottery;
    protected int curingTimeInMinutes;
    protected double price;
    protected Display display;

    public Glue(String name, double price, Display display) {
        this.name = name;
        this.price = price;
        this.display = display;
    }

    public Glue(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() throws IOException {
        display.displayOutput(name + "," + price);
    }
}