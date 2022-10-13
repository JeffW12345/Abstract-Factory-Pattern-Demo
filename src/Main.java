import java.io.IOException;

public class Main {
    GlueWithDisplayConcreteFactory factory;

    public static void main(String[] args) throws IOException {
        new Main().run();

    }

    private void run() throws IOException {
        factory = new GlueWithDisplayConcreteFactory(DisplayType.CSV, GlueType.PRITSTICK, 1.01,
        "Prit stick");
        factory.glue.display();
    }


}
