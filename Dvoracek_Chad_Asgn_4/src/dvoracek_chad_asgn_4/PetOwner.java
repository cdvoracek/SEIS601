/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_4;

/**
 *
 * @author Chad
 */
public class PetOwner 

{
private String FirstName;
private String LastName;
private String Address;
private boolean hasPet;
private int numPets;
private boolean hasOwnedPet;



 // Owner Constructor
        private PetOwner (String FirstName, String LastName, String Address, boolean hasPet,
        int numPets, boolean hasOwnedPets, int numHistoricalPets) 
        {
        FirstName           =null;
        LastName            =null;
        Address             =null;
        hasPet              =false;
        numPets             =0;
        hasOwnedPets        =false;
        numHistoricalPets   =0;
           
        }
    
}
