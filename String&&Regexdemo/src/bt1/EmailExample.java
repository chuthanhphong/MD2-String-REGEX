package bt1;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static  String Email_regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(Email_regex);
    }
    public boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }

}
