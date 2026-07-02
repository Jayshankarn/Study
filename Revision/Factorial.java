package Revision;

public class Factorial {

    public static int printfactorial(int n){
        if(n==1 || n == 0){
            return 1 ;
      }

      int calcfact = printfactorial(n-1);
       int factn_m1 = n * calcfact;
       return factn_m1 ;


    }

    public static void main(String[]args){
   int n = 5;
   int ans = printfactorial(n);
   System.out.println(ans);

    }
    
}
