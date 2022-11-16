package org.example;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.example.Solution1.checkWordBalloon;

//import static java.util.prefs.WindowsPreferences.logger;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            File newFile = new File("readFile");

            if (newFile == null) {
                throw new FileNotFoundException();
            }

            if(newFile.length()>100){
                throw new WordTooLong();
            }

            File writeFile = new File("writeFile.txt");

            FileWriter writer = new FileWriter(writeFile);

            FileReader readFile = new FileReader(newFile);

            BufferedReader reader = new BufferedReader(readFile);
            String s;
            while ((s = reader.readLine()) != null) {
                String se = String.valueOf(checkWordBalloon(s));
                writer.write(se);
                writer.write("  ");
            }

            readFile.close();
            writer.close();

        } catch (FileNotFoundException e) {
            logger.log(Level.WARNING, "File not found" + e.getMessage());
        } catch (WordTooLong e){
            logger.log(Level.WARNING,e.getMessage());
        }
    }
}


