package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UppercaseReader {

    public String readFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        return scanner.nextLine();
    }

    public void displayUppercaseText(String filename) {
        try {
            String text = readFromFile(filename);
            System.out.println(text.toUpperCase());
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. Details " + e.getMessage());
        }
    }
}
