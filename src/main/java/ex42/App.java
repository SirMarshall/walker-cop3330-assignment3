/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex42;
import ex41.fileHandling;

import java.io.File;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        //Necessary Variables
        int numRecords = 0;

        //File declaration
        File input = new File("src/main/java/ex42/exercise42_input.txt");

        //Call to method to count number of records
        numRecords = fileHandling.countRecords(input,numRecords);

        //Initialization of arrays
        String[][] records = new String[numRecords][2];
        CSV.recordIndexer(input,numRecords,records);

        CSV.recordPrinter(numRecords,records);


    }
}

