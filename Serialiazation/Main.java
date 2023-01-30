package Serialiazation;
import javax.imageio.stream.FileImageOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Horshy";
        user.Password = "I<pizza";

        FileOutputStream fileout = new FileOutputStream("Userinfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(user);
        out.close();;
        fileout.close();

        System.out.println("object info saved! ) ");
    }
}
