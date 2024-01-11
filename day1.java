import java.util.*;
public class day1 {
    public static void main(String[] args) {

//        string
        String sc= new String();
        sc="hello";
        System.out.println(sc);

//        arraylist
        ArrayList<Integer> a1= new ArrayList<Integer>();
        a1.add(100);
        a1.add(92);
        a1.add(34);
        Collections.sort(a1);
        for (int i:a1){
            System.out.println(i);
        }

//        queue (linked list)
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("raj");
        l1.add("dhyey");
        l1.add("rayyy");
        l1.add("vidz");
        l1.removeFirst();
        System.out.println(l1);

//        sets
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(102);
        hs1.add(202);
        hs1.add(303);
        hs1.add(102);
        System.out.println(hs1);

//     hasmap
    HashMap<Integer ,  String>map1= new HashMap<>();
    map1.put(11,"harshil");
    map1.put(32,"raj");
    map1.put(35,"dhyey");

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        for (int i: map1.keySet())
        {
            System.out.println("roll:"+i+" "+"name:" +map1.get(i));
        }




    }
}
