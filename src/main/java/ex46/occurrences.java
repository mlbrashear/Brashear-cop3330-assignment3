package ex46;

import java.util.ArrayList;

public class occurrences {
    public static int count(ArrayList<String> file, String word) {
        //declare variables
        int count = 0;
        //add one to count every time the word equals the inserted word
        for(int i = 0; i < file.size(); i++){
            if(file.get(i).equals(word))
                count++;
        }
        //return
        return count;
    }
}
