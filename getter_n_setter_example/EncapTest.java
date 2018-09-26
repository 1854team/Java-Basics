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

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();     //creates new instance of EncapTest
        encap.setName("James");                      //user can create new name for private name variable
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.println("Name: " + encap.getName() + " \n" + "Age: " + encap.getAge());
    }
}
