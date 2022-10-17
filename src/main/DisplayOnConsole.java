package main;

import main.Display;

public class DisplayOnConsole implements Display {

    @Override
    public void displayOutput(String toDisplay) {
        System.out.println(toDisplay);
    }
}
