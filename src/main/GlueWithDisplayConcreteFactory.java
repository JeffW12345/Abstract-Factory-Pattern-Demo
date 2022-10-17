package main;

import main.*;

public class GlueWithDisplayConcreteFactory implements GlueWithDisplayAbstractFactory{
    private Display display;
    Glue glue;
    private GlueType glueType;
    private DisplayType displayType;
    private double price;
    private String name;
    private DisplayFactory displayFactory = new DisplayFactory();
    private GlueFactory glueFactory = new GlueFactory();

    public GlueWithDisplayConcreteFactory(DisplayType displayType, GlueType glueType, double price,
                                          String name) {
        this.displayType = displayType;
        this.glueType = glueType;
        this.price = price;
        this.name = name;
        this.display = createDisplay();
        this.glue = createGlue();
    }

    @Override
    public Display createDisplay() {
        return displayFactory.create(displayType);
    }

    @Override
    public Glue createGlue() {
        return glueFactory.create(GlueType.PRITSTICK, name, price, this.display);
    }
}
