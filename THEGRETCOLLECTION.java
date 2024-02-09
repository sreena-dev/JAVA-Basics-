import java.util.*;

public class THEGRETCOLLECTION {
    public static void main(String[] args) {
        List<Integer> i=new ArrayList<>();
        i.add(26);

        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(13);
        ll.addAll(i);
        System.out.println(ll);

        Set<String> hs=new HashSet<>();
        hs.add("10");

        Set<Integer> ts=new TreeSet<>();
        ts.add(50);

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(26,"mybday");
        

        
    }
}
