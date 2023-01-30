package Desirialiazer;

import java.io.Serializable;

public class User implements Serializable {

        String name;
        String Password;
        public void SayHello(){
            System.out.println("Hello"  + name);
        }
    }

