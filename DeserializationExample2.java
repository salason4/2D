import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("student.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = (Student) ois.readObject();
            System.out.println("Deserialization successful");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Major: " + student.getMajor());
        } catch (Exception e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }
    }
}
