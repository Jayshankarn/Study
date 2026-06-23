class Pen{
String colour;
int Number;


 public void Properties(){
    System.out.println("The colour of pen is " + colour + "And the Number of pens are " + Number);
 }

}
  class Student {

    public Student() {
        System.out.println("Constructor Called");
    }
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}


public class OopsPen {
    public static void main(String[]args){
        Pen p1= new Pen();
        Pen p2 = new Pen();
        Dog d = new Dog(); 
        Student S = new Student("Jayshankar",20);
       // p1.colour = "Black";
       // p1.Number = 10;
        p2.colour ="Red";
        p2.Number = 20;
        p1.Properties();
        p2.Properties();
     d.eat();
     d.bark();

    }
    
}
