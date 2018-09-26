/**
* Credit goes to: https://www.tutorialspoint.com/java/java_encapsulation.htm
*/

public class RunEncap {

    public static void main(String rgs[]) {
        EncapTest encap = new EncapTest();     //creates new instance of EncapTest
        encap.setName("James");                      //user can create new name for private name variable
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.println("Name: " encap.getName() + "Age: " encap.getAge());
    }
}
