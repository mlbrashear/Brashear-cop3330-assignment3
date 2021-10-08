package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //declare variables
        File inputFile = new File("src/main/java/ex42/exercise42_input.txt");
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> salary = new ArrayList<>();
        employee e = new employee();
        Scanner sc = new Scanner(inputFile);
        //fill each array with file content
        while(sc.hasNextLine()){
            String data = sc.next();
            String[] array = e.splitList(data);
            lastName.add(array[0]);
            firstName.add(array[1]);
            salary.add(array[2]);
        }
        //determine size of list and print accordingly
        System.out.println("Last      First      Salary\n--------------------------");
        for(int i = 0; i < firstName.size(); i++){
            if(i == 6) {
                System.out.print(lastName.get(6) + " ");
                System.out.print(firstName.get(6) + "\t");
                System.out.println(salary.get(6));
            }
            if(i == 4){
                System.out.print(lastName.get(4) + "\t ");
                System.out.print(firstName.get(4) + "\t");
                System.out.println(salary.get(4));
            }
            else if(i != 4 && i != 6) {
                System.out.print(lastName.get(i) + "\t ");
                System.out.print(firstName.get(i) + "\t\t");
                System.out.println(salary.get(i));
            }
        }
        //close scanner
        sc.close();
    }
}

/*
import necessary
public class Main {
    public static void main(String[] args) throws IOException {
        create exercise41_input.txt
        create file reader
        create list for first name
        create list for last name
        create list for salary
        create class variable

        while(there is next line) {
            create data string
            call class
            add to first name list
            add to last name list
            add to salary list
        }

        print header for list

        for(increase until max list size) {
            if(i equals 6th increment) {
                print 6th value of last name
                print 6th value of first name
                print 6th value of salary
            }
            if(i equals 4th increment) {
                print 4th value of last name
                print 4th value of first name
                print 4th value of salary
            }
            else if(i is not 4th or 6th increment) {
                print ith value of last name
                print ith value of first name
                print ith value of salary
            }
        }
        close reader
    }
}
*/