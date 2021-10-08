package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.ArrayList;

public class productInfo {
    public static int check(ArrayList<String> name, String input){
        //see if its apart of file
        for(int j = 0; j < name.size(); j++)
            if(name.get(j).indexOf(input) != -1)
                return j;
        return -1;
    }
}