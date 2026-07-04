package Revision;

class Account {
   public String name;
   protected String email;
   private String password;


   public void setPassword(String password) {
       this.password = password;
   }
   public String getPassword() {
    return password;
}
}
public class Modifiers { 
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Jayshankar";
       a1.setPassword("abcd");
       a1.email = "Kjayshankar182@gmail.com";
       System.out.println(a1.name);
        System.out.println(a1.email);
       System.out.println(a1.getPassword());
   }
}

