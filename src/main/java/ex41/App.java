/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex41;
import java.io.*;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //Declaring variables
        String[] names;
        int numNames = 0;

        //Initializing files
        File input = new File("src/main/java/ex41/exercise41_input.txt");
        File output = new File("src/main/java/ex41/exercise41_output.txt");

        //Finding number of names
        numNames = fileHandling.countRecords(input, numNames);
        names = new String[numNames];

        //Initializing array for use for reader function
        fileHandling.textReader(input, names);

        //Call sort method
        Arrays.sort(names);

        //Write to file
        fileHandling.textWriter(output, names);

        //Print results
        System.out.println("Total of " + numNames + " names");
        System.out.println("------------------");
        for (int i = 0; i < numNames; i++)
        {
            System.out.println(names[i]);
        }


    }
}
