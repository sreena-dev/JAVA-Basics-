import java.util.*;
public class stringsInJ{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();/

        String s="helo moto ";
        String ss="   goat ";
        //String[] ss={"love,hate,bby,kailash"};
        System.out.println(s.charAt(1));
        System.out.println(s.length());
        System.out.println(s.substring(1,3));
        System.out.println(s.substring(5));
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("moto"));
        System.out.println(s.replace("moto","java"));//note to give space at end in replace orelse end of the file reached error might appear
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith(" "));
        System.out.println(s.compareTo("bel"));//not sure:( 
        System.out.println(s.equals("helo moto "));
        System.out.println(s.equalsIgnoreCase("Helo MoTo "));
        System.out.println(s.indexOf("moto"));
        System.out.println(s.intern());//not sure:(
        System.out.println(s.isEmpty());
        // System.out.println(s.join("h","o"));
        System.out.println(s.replace("h","H"));
        System.out.println(ss);//look at the difference babe cooolll
        System.out.println(ss.trim());


    }
}