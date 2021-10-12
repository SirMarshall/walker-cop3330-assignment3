package ex42;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class CSVTest extends TestCase {

    public void testRecordIndexer() throws IOException {
        File input = new File("src/main/java/ex42/exercise42_input.txt");
        int numRecords = 6;
        String[][] records = new String[numRecords][2];
        records = CSV.recordIndexer(input, numRecords, records);

        assertEquals("55900", records[0][2]);


    }
}