/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex43;

import java.util.Scanner;
import java.io.*;

public class App
{
    public static void main( String[] args ) throws IOException {
        //Necessary Variables
        String siteName;
        String authorName;
        String answer;
        Boolean js, css;
        Scanner input = new Scanner(System.in);

        System.out.println("Site Name: ");
        siteName = input.nextLine();

        System.out.println("Author: ");
        authorName = input.nextLine();

        System.out.println("Do you want a folder for Javascript? (y/n)");
        answer = input.next();

        if (answer.equals("y"))
        {
            js = true;
        }
        else
        {
            js = false;
        }

        System.out.println("Do you want a folder for CSS? (y/n)");
        answer = input.next();

        if (answer.equals("y"))
        {
            css = true;
        }
        else
        {
            css = false;
        }

        htmlCreator.boilerplateCreator(siteName, authorName, js, css);
    }
}
