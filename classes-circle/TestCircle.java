public class TestCircle {
    public static void main(String[] args) {
    
    // Declare & construct an instance of the Circle class called c1, which uses the 3rd constructor because it has two params
    Circle c1 = new Circle(2.0, "blue");
    System.out.println("The radius is: " + c1.getRadius());
    System.out.println("The color is: " + c1.getColor());
    System.out.println("The area is: %.2f%n", c1.getArea());


    //Declare & construct c2, which uses the 2nd constructor because passes 1 param
    Circle c2 = new Circle(2.0);
    System.out.println("The radius is: " + c2.getRadius());
    System.out.println("The color is: " + c2.getColor());
    System.out.println("The area is: %.2f%n"., c2.getArea());

    //Declare & construct c3, which uses 1st constructor
    Circle c3 = new Circle();  // Use 1st constructor
    System.out.println("The radius is: " + c3.getRadius());
    System.out.println("The color is: " + c3.getColor());
    System.out.printf("The area is: %.2f%n", c3.getArea());
    
    }    //end of main()
}    //end of TestCircle 
