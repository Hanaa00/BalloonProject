package org.example;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileNotFoundExTest {

    static Logger logger=Logger.getLogger(FileNotFoundExTest.class.getName());

    @BeforeClass
    public static void startInfo(){logger.log(Level.INFO,"Test has started");}

    @Test
    public void testConstructor() {

        FileNotFoundException TextException = new FileNotFoundException("readFile.txt not found");
        assertEquals("readFile.txt not found", TextException.getLocalizedMessage());

    }

    @AfterClass
    public static void endInfo(){logger.log(Level.INFO,"Test has ended");}

    

}