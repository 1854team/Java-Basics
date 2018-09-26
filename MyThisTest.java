/**
* Shows how to use keyword "this" in different ways
* Credit goes to: Joachim Sauer (see: https://stackoverflow.com/questions/3728062/what-is-the-meaning-of-this-in-java)
*/

public class MyThisTest {
    private int a;
    
    public MyThisTest() {
        this(42);
    }
    
    public MyThisTest(int a) {
        this.a = a;
    }
    
    public void frobnicate() {
        int a = 1;
        
        System.out.println("Local variable is: " + a); //local variable a
        System.out.println("Field a is: " + this.a); //field a
        System.out.println("This entire object is: " + this); //entire object
    }
    
    public String toString() {
        return "MyThisTest a=" + a; //field a
    }
    
    public static void main(String[] args){
        MyThisTest object = new MyThisTest();
        object.frobnicate();
    }
    
}
