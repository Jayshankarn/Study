package Revision;
import java.util.*;

public class Hashmap {

    public static void main(String[]args){

        HashMap<String, Integer> Java = new HashMap<>();

        Java.put("India", 150);
         Java.put("China", 140);
          Java.put("Ausralia", 20);
           Java.put("US", 40);

           System.out.println(Java);

           if(Java.containsKey("India")){
            System.out.println("India is present");
           }
            else {
         System.out.println("Not Present");
           }
           System.out.println(Java.get("India"));
           System.out.println(Java.get("South Africa"));

           int arr[] = {1, 2, 3};
         for(int val : arr){
            System.out.print(val + " ");
         }
         System.out.println("");

          //Iteration (1)
       for( Map.Entry<String, Integer> e : Java.entrySet()) {
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }


       //Iteration (2)
       Set<String> keys = Java.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + Java.get(key));
       }


       //Removing
       Java.remove("China");
       System.out.println(Java);


    }
    
}
