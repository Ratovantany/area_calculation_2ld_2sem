import java.util.Scanner;

abstract class Figura {
      abstract double getArea();
      abstract double getPerimeter();
    }
    class Rectangle extends Figura { 
      double width;
      double height;
       
      public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    double getArea(){
      return width*height;
    }
    double getPerimeter(){
      return (width+height)*2;
    }
}
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int skaits =sc.nextInt();

      Figura[] a = new Rectangle[skaits];
        for(int i =0; i<skaits; i++){
          double width = sc.nextDouble();
          double height = sc.nextDouble();
          a[i]= new Rectangle(width, height);
          }
        for (Figura b:a){
          double laukums = b.getArea(); 
          double perimetrs = b.getPerimeter();
          System.out.printf("%.2f %.2f%n", laukums, perimetrs);
          }
    sc.close();
  }
}