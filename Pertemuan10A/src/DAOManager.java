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
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 */
public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
