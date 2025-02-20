// Shape Drawing System
// Create a base class Shape with a method draw().
// Implement subclasses:
// Circle
// Rectangle
// Triangle
// Override draw() to print different shapes dynamically using polymorphism

package Shape_code;

class Shape{
    public void draw(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("This is a circle");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("This is a rectangle");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("This is a triangle");
    }
}


public class ShapeOops {
    public static void main(String args[]){
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        triangle.draw();
        circle.draw();
        rectangle.draw();
    }
}
