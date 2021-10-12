package ex42;
import java.io.*;

public class CSV
{
    public static String[][] recordIndexer (File input, int numRecords, String array[][]) throws IOException
    {
        BufferedReader instream = new BufferedReader(new FileReader(input));
        String currentRecord;

        for (int i = 0; i < numRecords; i++)
        {
            currentRecord = instream.readLine();
            array[i] = currentRecord.split(",");
        }

        return array;
    }

    public static void recordPrinter (int numRecords, String array[][])
    {
        System.out.println("Last\t\tFirst\t\tSalary");
        System.out.println("------------------------------");

        for (int i = 0; i < numRecords; i++)
        {
            System.out.format("%-9s\t%-10s\t%-10s\n", array[i][0], array[i][1], array[i][2]);
        }
    }
}
