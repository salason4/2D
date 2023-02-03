package SerilizatioandDeserialiaztion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main1 {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "horsybajo";
        user.password = "Toheeb123";

        FileOutputStream out = new FileOutputStream("useerrinfo.ser");
        ObjectOutputStream o = new ObjectOutputStream(out);
        o.writeObject(user);
        o.close();
        out.close();

        System.out.println("Serialization successful");
    }
}