import java.util.LinkedList;
public class SearchLinked {

    

    public static void main(String[]args){

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(7);
             list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        for(int i =0; i<list.size(); i++){
            if(list.get(i) ==3){
                System.out.println("Element found at index: " + i);;
            }
        }
      // System.out.println(list);
        }
    }

    

