package bt5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static   Pattern pattern;
    private Matcher matcher;
    private final String Defaul_number = "^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";

    public ValidateNumberPhone() {
        pattern = Pattern.compile(Defaul_number);
    }
    public boolean check(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
