package ex45;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void wordReplacer() throws IOException
    {
        File input = new File("src/main/java/ex45/exercise45_input.txt");
        File output = new File("src/main/java/ex45/exercise45_output.txt");
        File testOutput = new File("src/main/test/java/ex45/expectedoutput.txt");
        String[] actualOutput = new String[1];
        String[] expectedOutput = new String[1];
        ex45.App.wordReplacer(input,output);
        ex41.fileHandling.textReader(output, actualOutput);
        ex41.fileHandling.textReader(testOutput, expectedOutput);

        assertEquals(actualOutput, expectedOutput);
    }
}