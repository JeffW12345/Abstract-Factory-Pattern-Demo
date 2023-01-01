package main;

import main.display_object.Display;
import main.glue_object.Glue;

public interface GlueWithDisplayAbstractFactory {
    Display createDisplay();
    Glue createGlue();
}
