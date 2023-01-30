package Desirialiazer;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

           try{
               // Open the file to read the serialized object
            FileInputStream file = new FileInputStream("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\Serialiazation\\Userinfo.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            // Deserialize the object from the file
            user = (User) in.readObject();

            // Close the input stream
            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("Object: " + user.name);
            System.out.println("Object: " + user.Password);
            user.SayHello();
    } catch (Exception ex) {
        System.out.println("Exception during deserialization: " + ex);
    }
}
}




