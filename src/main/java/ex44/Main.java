package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Main {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        String userInput;
        JSONParser parser = new JSONParser();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> quant = new ArrayList<>();
        ArrayList<String> price = new ArrayList<>();

        try {
            //open file
            Object fr = parser.parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
            JSONObject input = (JSONObject)fr;
            JSONArray products = (JSONArray)input.get("products");
            //fill variables with file
            for(int i = 0; i < products.size(); i++) {
                String data = String.valueOf(products.get(i));
                String[] array = data.split(",");
                names.add(array[2]);
                price.add(array[1]);
                quant.add(array[0]);
            }
            //ask until they get something right
            while(temp == 1){
                System.out.println("What is the product name?");
                userInput = sc.nextLine();
                //print product info
                if(productInfo.check(names, userInput) != -1) {
                    int index = productInfo.check(names, userInput);
                    System.out.println("Name: " + names.get(index).substring(names.get(index).indexOf(userInput), names.get(index).length() - 2));
                    System.out.println("Price: " + price.get(index).substring(8, price.get(index).length()));
                    System.out.println("Quantity: " + quant.get(index).substring(12, quant.get(index).length()));
                    temp = 0;
                }
                //ask again
                if(temp == 1)
                    System.out.println("Sorry, that product was not found in our inventory.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
import classes

public class Main {
    public static void main(String[] args) {
        create scanner
        create temp int = 1
        create string for user input
        set up JSON parcer
        create array list for names
        create array list for price
        create array list for quantity

        try {
            use parcer.parse to read through file
            JSON object
            create JSON array list for products

            for(product size) {
                create string for data of products
                create an array that splits the data for every ,
                add names to the array at 2
                add price to array at 1
                add quantity to array at 0
            }

            while(temp still equals 1) {
                ask user for product name
                make user input equal next line
                if(user input equals a product in file) {
                    find the index where the product is at
                    print product name
                    print product price
                    print product quantity
                    make temp = 0 so while loop stops
                }
                if(temp is still 1)
                    ask user to reenter info
            }
        }catch
    }
}

 */