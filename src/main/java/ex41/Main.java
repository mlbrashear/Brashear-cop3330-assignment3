package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Declare variables
        File inputFile = new File("src/main/java/ex41/exercise41_input.txt");
        ArrayList<String> listNames = new ArrayList<>();
        sortNames l = new sortNames();
        Scanner sc = new Scanner(inputFile);

        //loop to scan each name in file
        while(sc.hasNextLine()) {
            String data = sc.nextLine();
            listNames.add(data);
        }

        //call function to sort the names
        listNames =  l.sort(listNames);

        //print findings
        System.out.println("Total of " + listNames.size() + " names\n-----------------");

        for(int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i));
        }

        sc.close();
    }
}


/*
Create exercise41_input.txt file that contains the list of names

import all necessary classes for code

public class Main {
    public static void main(String[] args) {
    Create fileReader
    Create array list to store names

    while(next line exists in file)
        import the line into main
        add to array list

    Call sortNames class to sort the names

    print size of array using function

    for(loop for number of elements in array)
        print each name in the elements

    }
}

*/
