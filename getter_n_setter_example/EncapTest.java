/**
* Credit goes to: https://www.tutorialspoint.com/java/java_encapsulation.htm
*/

public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge( int newAge ) {    //gives outside user access to "set" the *private* int age variable
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum (String newId) {
        idNum = newId;
    }
}
