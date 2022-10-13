import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DisplayToCSV implements Display {
    @Override
    public void displayOutput(String toDisplay) throws IOException {
        String filepath = "C:/test.csv";
        if(new File(filepath).exists()){
            appendToFile(toDisplay, filepath);
        }
        else{
            writeToNewFile(toDisplay, filepath);
        }
    }

    private void writeToNewFile(String toDisplay, String filepath) throws IOException {
        FileWriter myWriter = new FileWriter(filepath);
        myWriter.write(toDisplay + "\n");
        myWriter.close();
    }

    private void appendToFile(String toDisplay, String filepath) throws IOException {
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
