package main.display_object;

import main.DisplayType;
import main.exception.InvalidDisplaySpecifiedException;

import java.io.*;

public class DisplayToCSV implements Display {
    @Override
    public void displayOutput(String toDisplay) {
        String filepath = "C:/test.csv";
        if(new File(filepath).exists()){
            appendToFile(toDisplay, filepath);
        }
        else{
            writeToNewFile(toDisplay, filepath);
        }
    }

    private void writeToNewFile(String toDisplay, String filepath) {
        try{
            FileWriter myWriter = new FileWriter(filepath);
            myWriter.write(toDisplay + "\n");
            myWriter.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    private void appendToFile(String toDisplay, String filepath) {
        try
        {
            String filename= filepath;
            FileWriter fw = new FileWriter(filename,true);
            fw.write(toDisplay + "\n");
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
