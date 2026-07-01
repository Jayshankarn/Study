import java.util.*;

public class Solidrectangle{

    
    

    public static void main(String[]args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows");
       int a = sc.nextInt();
       System.out.println("Enter number of columns");
       int b = sc.nextInt();

       
    

       for(int i=1; i<=a; i++){
       for(int j= 1; j<=b; j++){
         System.out.print("*");
       }
         System.out.println();
       }
       sc.close();
    }
}