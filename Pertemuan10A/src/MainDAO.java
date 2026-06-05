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
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 */
public class MainDAO{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

