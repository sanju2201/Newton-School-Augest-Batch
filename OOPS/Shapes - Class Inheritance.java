import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
   double heightOfPgm;

   Parallelogram(double side1, double side2, double height){
       super(side1,side2,side1,side2); // side
       this.heightOfPgm = height;
   }

   public double getArea(){
       return side1*heightOfPgm;
   } 
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    Rhombus(double s, double h){
        super(s,s,h);
    }
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
   Rectangle(double l,double b){
       super(l,b,b);
   }
  
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
   Square(double side){
       super(side,side);
   }
   
}

// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

       // Input for Parallelogram
       // parimeter = side1 + side2 + side1 + side2
       // area = side1 * height 
       double side1OfPgm = sc.nextDouble();
       double side2OfPgm = sc.nextDouble();
       double heightOfPgm = sc.nextDouble();

       // Input for Rhombus
       // parimeter = side + side + side + side
       // area = side * height
       double sideOfRhom = sc.nextDouble();
       double heightOfRhom = sc.nextDouble();

       // Rectangle 
       // Perimeter = length + breadth + length +breadth
       // area = length * breadth

       double lengthOfRec = sc.nextDouble();
       double breadthOfRec = sc.nextDouble();

       // Square
       // Perimeter = side + side + side + side
       // area = side*side

       double sideOfSquare = sc.nextDouble();

       // Checking Non Negative Condition
       if(side1OfPgm<0 || side2OfPgm<0 || heightOfPgm<0 || sideOfRhom<0 || heightOfRhom<0 || 
       lengthOfRec<0 || breadthOfRec<0 ||sideOfSquare<0){
           System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
       return;
       }

    // Creating Objects to call the methods getPerimeter and getArea

    Parallelogram p = new Parallelogram(side1OfPgm,side2OfPgm,heightOfPgm);
    Rhombus rhombus = new Rhombus(sideOfRhom, heightOfRhom);
    Rectangle rectangle = new Rectangle(lengthOfRec, breadthOfRec);
    Square square = new Square(sideOfSquare);

    // Printing Outputs
    System.out.println("Perimeter of Parallelogram is "
         + p.getPerimeter() +
         " and Area of Parallelogram is " + 
         p.getArea());

     System.out.println("Perimeter of Rhombus is "
          + rhombus.getPerimeter() +
          " and Area of Rhombus is "
           + rhombus.getArea());
    
    System.out.println("Perimeter of Rectangle is "
          + rectangle.getPerimeter() +
          " and Area of Rectangle is "
           + rectangle.getArea());

     System.out.println("Perimeter of Square is "
          + square.getPerimeter()
          + " and Area of Square is "
           + square.getArea());     
     
       sc.close();
   }
}
