package ex41;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class fileHandlingTest extends TestCase {

    public void testCountNames() throws IOException {
        File input = new File("src/main/java/ex41/exercise41_input.txt");
        int names = 0;
        int result = 0;
        result = fileHandling.countRecords(input, names);

        assertEquals(7, result);
    }
}