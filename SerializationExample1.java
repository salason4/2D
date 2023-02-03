import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample1 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 25, "Computer Science");
        try (FileOutputStream fos = new FileOutputStream("student.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            System.out.println("Serialization successful");
        } catch (Exception e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}

class Student implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
