 import java.util.*;

public  class Revision {
    public static void main(String[]args){

       
       int age = 20;
       String name = "Jayshankar";
       Double PI =3.14;

       Scanner c = new Scanner(System.in);
        int radius = c.nextInt();
        Double AreaofCircle =PI*radius*radius;
        System.out.println(AreaofCircle);
        
        System.out.println(radius);
        System.out.println(" ");

       System.out.println(name);
       System.out.println(age);
       c.close();
    } 
    
    
}