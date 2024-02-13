// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
import java.util.regex.*;


public class emailValidation {
    public static void main(String[] args) {
        // Email address to validate
        String emailAddress = "username@1455domain.cfgom";

        String num="+91 1234567890";

        // Regular expression for email validation
        // String regexPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                // + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String regexPattern="^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.]+[a-zA-Z]{2,}$";

        String regexNum="^\\+91 \\d{10}$";

        Pattern p=Pattern.compile(regexNum);
        Matcher m=p.matcher(num);

        System.out.println(m.matches());

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regexPattern);

        // Create a Matcher for the email address
        Matcher matcher = pattern.matcher(emailAddress);

        // Check if the email address matches the pattern
        boolean isValid = matcher.matches();

        // Print the result
        System.out.println("Is the email address valid? " + isValid);
    }
}