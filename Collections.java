import java.util.*;

//USER DEFINED GENERICS 
class Container<T extends Number>{
    T val;
    public void show(){
    System.out.println(val.getClass().getName());
    }
}
public class Collections {
    public static void main(String[] args) {
        //CHECKED 
        Collection<Integer> vals =new ArrayList<Integer>();
        vals.add(5);
        vals.add(6);
        System.out.println(vals);

        //CALLED
        Container<Integer> obj=new Container<Integer>();
        obj.val=8;
        obj.val=4;
        obj.val=7;
        obj.show();

        //USE OF ITERATOR
        Iterator<Integer> o=vals.iterator();
        System.out.println("ITERATOR "+o.next());//give the print as many time as value is there

        //USE OF ENHANSED FOR LOOP 
        for(Object i:vals){
            System.out.println("E FOR LOOP  "+i);
        }

        //FOR EACH
        vals.forEach(System.out::println);
    }
}
