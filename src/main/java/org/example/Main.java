package org.example;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import static org.example.Solution1.checkWordBalloon;

//import static java.util.prefs.WindowsPreferences.logger;

public class Main {
    static Logger logger=Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException {

        try {

            File newFile = new File("readFile.txt");

            if (newFile == null) {
                throw new FileNotFoundException();
            }

            if(newFile.length()>100){
                throw new WordTooLongException();
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
        } catch (WordTooLongException e){
            logger.log(Level.WARNING,e.getMessage());
        }

    }
}


