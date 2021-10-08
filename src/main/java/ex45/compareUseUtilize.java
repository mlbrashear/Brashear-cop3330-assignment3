package ex45;

public class compareUseUtilize {
    public static int useUtilize(String arr) {
        //return value depending on the word
        if(arr.equals("utilize"))
            return 1;
        else if(arr.equals("utilizes"))
            return 2;
        else if(arr.equals("\"utilize\""))
            return 3;
        else
            return 0;
    }
}
