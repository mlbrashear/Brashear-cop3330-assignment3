package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        //declare variables
        String siteName, author, siteJS, siteCSS;
        nameWebsite nw = new nameWebsite();
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("Site name:");
        siteName = sc.nextLine();
        System.out.println("Author:");
        author = sc.nextLine();
        System.out.println("Do you want a folder for JavaScript?");
        siteJS = sc.nextLine();
        System.out.println("Do you want a folder for CSS?");
        siteCSS = sc.nextLine();

        //print some of the findings
        System.out.println("Created " + nw.website(siteName));
        System.out.println("Created " + nw.websiteIndexhtml(siteName));

        try {
            //create and declare file
            File index = new File("src/main/java/ex43/index.html");
            //insert html into file
            BufferedWriter bw = new BufferedWriter(new FileWriter(index));
            bw.write(String.format("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "    <title>%s</title>\n" + "<meta author name =\"%s\">\n" + "</head>\n" + "</html>", siteName, author));
            bw.close();
            //if they want Java Script
            if(siteJS.equals("y")){
                System.out.println("Created " + nw.websitejs(siteName));
                File f1 = new File("src/main/java/ex43/JavaScript");
                f1.mkdirs();
            }
            //if they want CSS
            if(siteCSS.equals("y")){
                System.out.println("Created " + nw.websitecss(siteName));
                File f2 = new File("src/main/java/ex43/CSS");
                f2.mkdirs();
            }
        //in case making the file messes up
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
import necessary java files

public class Main {
    public static void main(String[] args) {
        string for site name, js, css, and author
        declare class
        declare scanner

        prompt user for site name
        scan site name
        prompt user for author
        scan author
        prompt user if they want js
        scan yes or no
        prompt user if they want css
        scan yes or no

        call to website naming class and print first created name
        call to website naming class and print second created name

        try {
            create and declare file
            use BufferedWriter to write into file
            write the wanted html code in file
            close writer
            if(user wanted js file) {
                create and declare file
                create folder
                print that js file was created
            }
            if(user wanted css file) {
                create and declare file
                create folder
                print that css file was created
            }
        } catch (IOException e) {
            e.printStackTrace();
          }
    }

} 
 */