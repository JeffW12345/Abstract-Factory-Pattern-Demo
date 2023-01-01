package main.display_object;

public class DisplayOnConsole implements Display {

    @Override
    public void displayOutput(String toDisplay) {
        System.out.println(toDisplay);
    }
}
