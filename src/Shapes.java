/**
 * Created by ngondo on 10/31/15.
 */
/*
*Project that shows use of method and method calls in Java.
* It simply calculates the areas of different shapes in different classes
* to show how one can achieve method calls from different classes in java
*/
public class Shapes {
    public static void main(String agrs[]){
//        Created new objects for circle, square and triangle
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
/* Outputs of different areas to console
*making the method calls directly
*/
        System.out.print("Area of square side = 67: " + square.areas(67));
        System.out.print("Area of circle radius = 67: " + circle.areac(67));
        System.out.print("Area of square triangle base=67, height=20: " + triangle.areat(67,20));
    }
}
