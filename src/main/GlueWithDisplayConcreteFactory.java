package main;

import main.display_object.Display;
import main.display_object.DisplayToCSV;
import main.glue_object.Glue;

public class GlueWithDisplayConcreteFactory implements GlueWithDisplayAbstractFactory{
    private final Display display;
    private final Glue glue;
    private final GlueType glueType;
    private final DisplayType displayType;
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
        return glueFactory.create(glueType, name, price, this.display);
    }
}
