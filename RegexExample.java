import java.util.regex.*;
import java.util.*;

public class RegexExample{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //String a=sc.nextLine();
        //String b=sc.nextLine();

        //Pattern pattern = Pattern.compile(a);
        //Matcher matcher = pattern.matcher(b);

        Pattern pattern = Pattern.compile(".xx.");
        //its a static method so dont try calling it with the object just call it with only class name
        //Pattern is the class here

        Matcher matcher = pattern.matcher("AxxA");
        
        System.out.println(matcher.matches());

        //System.out.println(m.matches());
        //only returns boolean value


        //this is another method to find the match btwn 2 regular expressions
        //boolean check = Pattern.matches(a,b);
        //System.out.println(check);
        
        sc.close();
    }
    
}
