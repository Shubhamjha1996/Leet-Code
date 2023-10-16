package org.example.Miscllenious;

import java.io.*;

public class SerializationAndDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serializable
        Student student=new Student("Shubham","sjha@gmail.com",1,"M");
        FileOutputStream fos=new FileOutputStream("ob.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(student);
        fos.close();
        oos.close();
        System.out.println("Changing of object to byte stream is serializable");


        //deserializable
        FileInputStream fis=new FileInputStream("ob.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student student1= (Student) ois.readObject();
        student1.displayName();
        System.out.println(student1.getName());
    }
}
