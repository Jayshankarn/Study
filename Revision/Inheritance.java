package Revision;

 class Shape{
    public void area(){
   System.out.print("Dispaly area");
}
 }
  class Triangle extends Shape{
    public void area(int length, int height){
  System.out.println(0.5 *length*height);
    }
  }
   class EquilateralTraingle extends Shape{
    public void area(int length, int height){
  System.out.println(0.5 *length*height);
    }
  }
   class Circle extends Shape{
    public void area( double PI, int r){
  System.out.println(PI*r*r);
    }
  }

public class Inheritance {


    public static void main(String args[]){
    Triangle t1 = new Triangle();
    t1.area(10, 5);

    Triangle t2 = new Triangle();
     t2.area(4, 5);

    Circle c1 = new Circle();
    c1.area(3.14, 10);
        
    }

    
}
