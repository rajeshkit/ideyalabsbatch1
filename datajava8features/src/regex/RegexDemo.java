package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String s="AMJPN7630";
        Pattern p=Pattern.compile("\\w+" );
        Matcher m=p.matcher(s);
        System.out.println(m.matches());





    }
}
