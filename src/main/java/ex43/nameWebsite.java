package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */

public class nameWebsite {
    public static String website(String ws) {
        //declare variables
        String orig = "./website/";
        //return combined strings
        return orig + ws;
    }
    public static String websiteIndexhtml(String ws) {
        //declare variables
        String orig1 = "./website/", orig2 = "/index.html";
        //return combined strings
        return orig1 + ws + orig2;
    }
    public static String websitejs(String ws) {
        //declare variables
        String orig1 = "./website/", orig2 = "/js/";
        //return combined strings
        return orig1 + ws + orig2;
    }
    public static String websitecss(String ws) {
        //declare variables
        String orig1 = "./website/", orig2 = "/css/";
        //return combined strings
        return orig1 + ws + orig2;
    }
}
