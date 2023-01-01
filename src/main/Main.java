package main;

import main.display_object.Display;
import main.glue_object.Glue;

import java.io.IOException;

public class Main implements Runnable {


    public static void main(String[] args) throws IOException {
        new Main().run();
    }
    @Override
    public void run() {
        GlueWithDisplayConcreteFactory factory = new GlueWithDisplayConcreteFactory(DisplayType.CONSOLE,
                GlueType.WOODGLUE, 5.00, "Wood glue");
        Glue glue = factory.createGlue();
        Display display = factory.createDisplay();
        try {
            glue.display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
