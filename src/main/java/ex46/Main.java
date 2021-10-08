package ex46;
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
        String badger = "badger", mushroom = "mushroom", snake = "snake";
        Scanner s = new Scanner(new File("src/main/java/ex46/exercise46_input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        occurrences o = new occurrences();
        //fill array
        while (s.hasNext()){
            list.add(s.next());
        }
        //create count variables and call to function
        int badgerCount = o.count(list, badger);
        int mushroomCount = o.count(list, mushroom);
        int snakeCount = o.count(list, snake);

        //if badger is the most occurring word
        if(badgerCount > mushroomCount && badgerCount > snakeCount){
            System.out.println("Badger: ");
            for(int i = 0; i < badgerCount; i++)
                System.out.print("*");
            if(mushroomCount > snakeCount) {
                System.out.println("\nMushroom: ");
                for(int i = 0; i < mushroomCount; i++)
                    System.out.print("*");
                System.out.println("\nSnake: ");
                for(int i = 0; i < snakeCount; i++)
                    System.out.print("*");
            }
            else if(snakeCount > mushroomCount) {
                System.out.println("\nSnake: ");
                for(int i = 0; i < snakeCount; i++)
                    System.out.print("*");
                System.out.println("\nMushroom: ");
                for(int i = 0; i < mushroomCount; i++)
                    System.out.print("*");
            }
        }
        //if snake is the most occurring word
        else if(snakeCount > badgerCount && snakeCount > mushroomCount) {
            System.out.println("Snake: ");
            for(int i = 0; i < snakeCount; i++)
                System.out.print("*");
            if(mushroomCount > badgerCount) {
                System.out.println("\nMushroom: ");
                for(int i = 0; i < mushroomCount; i++)
                    System.out.print("*");
                System.out.println("\nBadger: ");
                for(int i = 0; i < badgerCount; i++)
                    System.out.print("*");
            }
            else if(badgerCount > mushroomCount) {
                System.out.println("\nBadger: ");
                for (int i = 0; i < badgerCount; i++)
                    System.out.print("*");
                System.out.println("\nMushroom: ");
                for (int i = 0; i < mushroomCount; i++)
                    System.out.print("*");
            }
        }
        //if mushroom is the most occurring word
        else {
            System.out.println("Mushroom: ");
            for(int i = 0; i < mushroomCount; i++)
                System.out.print("*");
            if(badgerCount > snakeCount) {
                System.out.println("\nBadger: ");
                for(int i = 0; i < badgerCount; i++)
                    System.out.print("*");
                System.out.println("\nSnake: ");
                for(int i = 0; i < snakeCount; i++)
                    System.out.print("*");
            }
            else if(snakeCount > badgerCount) {
                System.out.println("\nSnake: ");
                for(int i = 0; i < snakeCount; i++)
                    System.out.print("*");
                System.out.println("\nBadger: ");
                for(int i = 0; i < badgerCount; i++)
                    System.out.print("*");
            }
        }
        s.close();
    }
}

/*
import necessary classes

public class Main {
    public static void main(String[] args) include throws statement {
        create strings that say badger, mushroom, and snake
        declare scanner for input.txt
        create array list
        call to function

        while (there is another line in the input.txt)
            copy into array list

        int count badgers = call to function to count number of times badgers occurs
        int count mushroom = call to function to count number of times mushroom occurs
        int count snake = call to function to count number of times snake occurs

        if(badgers occurs the most) {
            print badgers
            for(count badgers int)
                print 1 * for each loop
            if(snake > mushroom) {
                print snake
                for(count snake)
                    print *
                print mushroom
                for(count mushroom)
                    print *
             }
             else if(mushroom > snake) {
                print mushroom
                for(count mushroom)
                    print *
                print snake
                for(count snake)
                    print *
            }
        }
        else if(mushroom is the most) {
            print mushroom
            for(count mushroom)
                print *
            if(badger > snake) {
                print badger
                for(count badger)
                    print *
                print snake
                for(count snake)
                    print *
            }
            else if (snake > badger) {
                print snake
                for(count snake)
                    print *
                print badger
                for(count badger)
                    print *
            }
        }
        else {
            print snake
            for(snake counter)
                print *
            if(mushroom > badger) {
                print mushroom
                for(mushroom counter)
                    print *
                print badger
                for(badger counter)
                    print *
            }
            else if (badger > mushroom) {
                print badger
                for(badger counter)
                    print *
                print mushroom
                for(mushroom counter)
                    print *
            }
        }
    }
}

 */