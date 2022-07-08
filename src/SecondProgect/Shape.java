package SecondProgect;
//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter.
// Create 2 classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code.
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
  double radius;
  Circle(double radius){
      this.radius=radius;
  }
    @Override
    public void calculateArea() {
        System.out.println("The area of circle is "+(radius*radius)*Math.PI);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of circle is "+2*Math.PI*radius);
    }
}
class Square implements Shape{
    double length;
    Square(double length){
        this.length=length;
    }
    @Override
    public void calculateArea() {
        System.out.println("The area of square is "+length*length);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of square is "+(4*length));
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape[] shape={new Circle(5.0),new Square(10)};
       for( Shape objects:shape){
           objects.calculateArea();
           objects.calculatePerimeter();
       }

    }
}