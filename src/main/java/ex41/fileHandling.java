package ex41;
import java.io.*;

public class fileHandling
{
    public static int countRecords(File input, int names) throws IOException
    {   //Variables needed
        String currentName;
        int counter = 0;

        //Pass in File and buffer to read info
        BufferedReader instream = new BufferedReader(new FileReader(input));

        //While line is not empty, read file and pass into index of array
        while ((currentName = instream.readLine()) != null )
        {
            counter = counter + 1;
        }

        return counter;
    }
    public static String[] textReader (File input, String[] inbuf) throws IOException
    {
        //Variables needed
        String currentName;
        int counter = 0;

        //Pass in File and buffer to read info
        BufferedReader instream = new BufferedReader(new FileReader(input));

        //While line is not empty, read file and pass into index of array
        while ((currentName = instream.readLine()) != null )
        {
            inbuf[counter] = currentName;
            counter = counter + 1;
        }

        //Return updated list of names
        return inbuf;
    }

    public static void textWriter (File output, String[] contents) throws IOException
    {
        //Create buffer to write to file
        BufferedWriter outstream = new BufferedWriter(new FileWriter(output));

        //For length of array, print passed contents to file
        outstream.write("Total of " + contents.length + " names.\n");
        outstream.write("------------------\n");
        for (int i = 0; i < contents.length; i++)
        {
            outstream.write(contents[i] + "\n");
        }

        //Success!
        outstream.close();
    }
}
