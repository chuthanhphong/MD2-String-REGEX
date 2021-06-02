package bt4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameofClass {
        private static Pattern pattern;
        private static Matcher matcher;
        private static final String DEFAULT_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
       public NameofClass(){
               pattern= Pattern.compile(DEFAULT_REGEX);
       }
       public boolean validate(String regex){
               matcher =pattern.matcher(regex);
               return  matcher.matches();
       }
}
