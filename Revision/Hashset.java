package Revision;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String args []){

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
     
        Iterator it = set.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }

        if(set.contains(3)){
            System.out.println("Set contains The number 3");
        }
        if(!set.contains(19)){
            System.out.println("Set does not contains the number 19");
        }
        set.remove(1);
        if(set.contains(1)){
            System.out.println("1 is not present in set");
        }  else{
          System.out.println("1 is not present in set");
        }
           System.out.println("The size of se is" + set.size());
        System.out.println(set);

         
}
    }

     
