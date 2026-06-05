/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
// package MainDAO;
=======
package MainDAO;
>>>>>>> 23bc096feb16e53f702049a9302606bd4d813acf

/**
 *
 * @author imina
 */
/**
 * File : ReadSerializedPerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */
import java.io.*;

public class ReadSerializedPerson{
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = "+person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
