package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        //declare variables
        Scanner s = new Scanner(new File("src/main/java/ex45/exercise45_input.txt"));
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> newList = new ArrayList<String>();
        String outputFileName;
        compareUseUtilize c = new compareUseUtilize();

        //fill array
        while (s.hasNext()) {
            list.add(s.next());
        }
        //see if the words compare. if they do, chaange the word
        for (int i = 0; i < list.size(); i++) {
            int compare = c.useUtilize(list.get(i));
            if (compare == 1)
                newList.add("use");
            else if (compare == 2)
                newList.add("uses");
            else if (compare == 3)
                newList.add("\"use\"");
            else
                newList.add(list.get(i));
            newList.add(" ");
        }

        //change new array into string
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < newList.size(); i++) {
            sb.append(newList.get(i));
        }
        String str = sb.toString();

        //print string
        System.out.println(str);
        //get user input
        System.out.println("Please enter a name for the output file: ");
        outputFileName = sc.nextLine();
        //fill new file
        try {
            File index = new File("src/main/java/ex45/" + outputFileName + ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(index));
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Import classes

public class Main {
    public static void main(String[] args) throws {
        create scanner for file
        create scanner
        create array list for file
        create array list for altering the file
        create string for new file name
        call to class

        while(another line in file)
            add into array list

        for(size of array list) {
            create int for class, then call to class
            if(return 1)
                replace word to use in new array list
            else if(return 2)
                replace word to uses in new array list
            else if(return 3)
                replace word to "use" in new array list
            else
                make new array list equal to the current spot in old array list
            add space to new array list
        }
        declare string buffer
        for(new list size)
            append the new list
        to string
        print new string

        ask user for new file name
        scan new file name

        try {
            create new file with file name
            declare buffered writer
            insert string into new file
            close buffered writer
        } catch
    }
}

 */
