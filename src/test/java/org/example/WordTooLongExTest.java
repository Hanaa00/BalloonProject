package org.example;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTooLongExTest {

    static Logger logger=Logger.getLogger(WordTooLongExTest.class.getName());

    @BeforeClass
    public static void startInfo(){logger.log(Level.INFO,"Test has started");}

    @Test
    public void checkWord() {

        WordTooLongException WordTooLong = new WordTooLongException("word is too long");
        assertEquals("word is too long", WordTooLong.getLocalizedMessage());

    }

    @AfterClass
    public static void endInfo(){logger.log(Level.INFO,"Test has ended");}


}