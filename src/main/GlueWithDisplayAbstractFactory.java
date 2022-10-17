package main;

import main.Display;
import main.Glue;

public interface GlueWithDisplayAbstractFactory {
    Display createDisplay();
    Glue createGlue();
}
