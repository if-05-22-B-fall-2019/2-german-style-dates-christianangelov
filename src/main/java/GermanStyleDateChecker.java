import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String reg= "^(([0-2]?[0-9])|3[0-1])(\\.|\\s|-)?([1][1-2]|[0]?[1-9])(\\.|\\s|-)?((19[0-9]{2}|20[0-9]{2})|[0-9]{2})$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(dateString);
        return matcher;
    }
}
