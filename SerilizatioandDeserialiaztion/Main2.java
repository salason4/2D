package SerilizatioandDeserialiaztion;

import SerilizatioandDeserialiaztion.User;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream filein = new FileInputStream("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\useerrinfo.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        user = (User) in.readObject();
        in.close();
        filein.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.SayHello();



    }
}
