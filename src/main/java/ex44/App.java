/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex44;
import com.google.gson.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App
{
    public static int countRecords (File input)
    {
        return 3;
    }
    public static Boolean gsonSearch (product[] products, String query)
    {
        return true;
    }
    public static void gsonImport (File json, String product) throws FileNotFoundException
    {
        GsonBuilder gsonObject = new GsonBuilder();
        Gson object = gsonObject.create();
        product newProduct = object.fromJson(new FileReader("/src/main/java/ex44/exercise44_input.json"), product.class);
        System.out.println(newProduct.name);

    }

    public static void main(String[] args)
    {
        File input = new File("src/main/java/ex44/exercise44_input.json");
        Scanner userInput = new Scanner(System.in);
        String product;
        Boolean result;
        int records = countRecords(input);
        System.out.println("What is the product name?");
        product = userInput.next();

        //result = gsonSearch(products, product);

        //while (!result)
        {
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.println("What is the product name?");
            product = userInput.next();
            //result = gsonSearch(input, product);
        }

    }
}