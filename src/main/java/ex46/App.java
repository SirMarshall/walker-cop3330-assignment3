/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex46;
import ex41.fileHandling;

import java.io.*;

public class App
{
    public static void wordCounter (File input) throws IOException
    {
        //Necessary Variables to count words
        BufferedReader instream = new BufferedReader(new FileReader(input));
        String currentLine = instream.readLine();
        String sourceText = "";

        //Inserting string into array
        while (currentLine != null)
        {
            sourceText = sourceText + currentLine + " ";
            currentLine = instream.readLine();
        }

        //Removing spaces
        String[] wordArray = sourceText.trim().split("\\s+");
        String[] completedWords = new String[wordArray.length];

        //For each word
        for (int i = 0; i < wordArray.length + 1; i++)
        {
            //Make sure word has not already been tested...
            for (int j = 0; j < completedWords.length; j++)
            {
                try
                {
                    while (wordArray[i].equals(completedWords[j]))
                    {
                        i++;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    i = i - 1;
                    j = j - 1;
                }

            }

            //Extract word and count how many times word appears
            String wordOne = wordArray[i];
            System.out.printf("\n%10s:", wordOne);

            for (int k = 0; k < wordArray.length; k++)
            {
                String wordTwo = wordArray[k];
                if (wordOne.equals(wordTwo))
                {
                    System.out.printf("%s", "*");
                }
            }
            //Mark word as counted
            completedWords[i] = wordOne;
        }
    }
    public static void main( String[] args ) throws IOException
    {
        File instream = new File("src/main/java/ex46/exercise46_input.txt");
        wordCounter(instream);
    }
}
