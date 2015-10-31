public class Circle{
//    Constant declaration: A constant in java NEVER CHANGES whatsoever
    final double PI = 3.142;

    //Method for finding the area of a circle
    public double areac(double r){
        double radius = r;
        double area = PI * radius *radius;
        return area;
        /*The return type that has been predefined at the top there
* Ever may or may not have this. If return type is absent use "void"
* keyword to declare the methods
* */
    }

}