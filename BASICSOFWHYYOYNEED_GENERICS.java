import java.util.*;

public class BASICSOFWHYYOYNEED_GENERICS {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("gagag");
        al.add("ooopppsss");
        
        //get one element 
        String s=al.get(0);
        System.out.println(s);


        //List add_elem_without_generics= new ArrayList();
        //add_elem_without_generics.add("circle ");
        //System.out.println(add_elem_without_generics.get(0));
        //assigning values to the variable 
        //String circle = (String)add_elem_without_generics.get(0);
        //adding new method to the list
        //add_elem_without_generics.add(new Rectangle());
        //Rectangle rec= (Rectangle) add_elem_without_generics.get(1);

        //TO AVOID CONTINUOUS TYPE CASTING GENERICS IS USED 
        //USES: -> EASY TO READ WRITE AND SAFE 


        //to convert array to list

        String[] wrds={"app", "mang","bana"};
        Integer[] num={1,2,3,4};

        Double[] doub={2.3, 5.5, 7.8};

        List<String> wrdlst =convertarraytolist(wrds);
        List<Integer> numlst=convertarraytolistofINT(num);
        List<Double> doublst=convertarraytolistofINT(doub);


        System.out.println(wrdlst);
        System.out.println(numlst);
        System.out.println(doublst);

    }

    //access specifier, scope ,(input oda datatype)Any type in the array same should come in list represent so T datatype , conversion type,
    // method name, parameters are the array of certain type that is T[] , name is (array)
    //for any parameter type
    private static <T> List<T> convertarraytolist(T[] array)
    {
        return Arrays.asList(array);
    }

    //for Intger only
    //when the number class is extended the int, double are the only datatype comming up
    private static <T extends Number> List<T> convertarraytolistofINT(T[] array)
    {
        return Arrays.asList(array);
    }
}
