/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex45;
import jdk.jpackage.main.Main;

import java.io.*;
import java.util.Scanner;

public class App extends Main {
    public static void wordReplacer(File input, File output) throws IOException {
        //Necessary variables
        String unreplaced = "";
        BufferedReader instream = new BufferedReader(new FileReader(input));
        BufferedWriter outstream = new BufferedWriter(new FileWriter(output));
        String currentLine = instream.readLine();

        //Loop to read contents into string
        while (currentLine != null)
        {
            unreplaced = unreplaced + currentLine + "\n";
            currentLine = instream.readLine();
        }

        //Replace
        String replaced = unreplaced.replaceAll("utilize", "use");

        //Write to output
        outstream.write(replaced);
        outstream.flush();
        outstream.close();

    }
    public static void main( String[] args ) throws IOException {
        //Necessary Variables
        Scanner userInput = new Scanner(System.in);
        File input = new File("src/main/java/ex45/exercise45_input.txt");

        //Output name query
        System.out.println("What would you like the name of the output file to be? (include .txt)");
        String outputName = userInput.next();
        File output = new File("src/main/java/ex45/" + outputName);

        //Call to word replacer method
        wordReplacer(input, output);
    }

}
