import java.util.*;
public class Sumofn {

public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Nunmber to add");
    int n = sc.nextInt();

    int sum = 0;
    
     for( int i=1; i<=n; i++){
     sum = sum+ i;
     
     } 
        System.out.print("Your sum is " + sum);
        sc.close();

}
    
}
