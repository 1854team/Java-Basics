public class Circle {    //class name
    private double radius;        //private instance variables used by the Constructors, but can't be used by TestCircle
    private String color;           //access to private members is through public assessor methods (interfaces) below

    // Constructors (overloaded)
    public Circle() {        //a default constructor b/c it has no parameter
        radius = 1.0;        //default values
        color = "red";
    }

    public Circle(double r)    {      //2nd constructor overloads default constructor with double parameter
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {    //3rd constructor
        radius = r;
        color = c;
    }

    //methods
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;

    public double getArea() {
        return radius * radius * Math.PI;
    }         
}   //end of public class
