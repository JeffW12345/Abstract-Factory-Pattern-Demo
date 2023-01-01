package main;

import main.display_object.Display;
import main.exception.InvalidGlueSpecifiedException;
import main.glue_object.Glue;
import main.glue_object.Pritstick;
import main.glue_object.SuperGlue;
import main.glue_object.WoodGlue;

public class GlueFactory {

    public Glue create(GlueType glueType, String name, double price, Display display){
        if(glueType == GlueType.SUPERGLUE){
            return new SuperGlue(name, price, display);
        }
        if(glueType == GlueType.PRITSTICK){
            return new Pritstick(name, price, display);
        }
        if(glueType == GlueType.WOODGLUE){
            return new WoodGlue(name, price, display);
        }
       throw new InvalidGlueSpecifiedException("ERROR - Factory method does not contain glue type specified.");
    }
}
