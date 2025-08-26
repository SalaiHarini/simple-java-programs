class Person {
    // private field: accessible only inside this class
    private String name;

    // public method: accessible from outside the class
    public void setName(String newName) {
        name = newName;  // modify private variable
    }

    // public method: accessible from outside the class
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

public class pubpri {
    public static void main(String[] args) {
        Person p1 = new Person();

        // p1.name = "John";  ❌ Not allowed (private variable)

        p1.setName("John");   // ✅ Allowed via public method
        p1.displayName();     // ✅ Output: Name: John
    }
}