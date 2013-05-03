/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Chad
 */
//accessors and mutators for all sub classes whether we use or not
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
     
   
    Pet pet1;
    pet1 = new Pet("Dragon","Puff", "Knights of the Round Table");
        
    PetOwner po1;
    po1 = new PetOwner("Jackie", "Paper","123 Main Street");
    po1.setRefName(po1);
        
    po1.adoptPet(po1,pet1, 1);
    pet1.setOwner(po1);
    
    Pet pet2;
    pet2 = new Pet ("Cat", "Tommy","Fish");
    po1.adoptPet(po1,pet2, 2);
    pet2.setOwner(po1);
    po1.dump(po1);
    //System.out.println(pet2.getOwner());
    
    
    //start pet set 2
    
    Pet pet3;
    pet3 = new Pet("Dinosour","Dino", "Brontosaurus Steaks");
        
    PetOwner po2;
    po2 = new PetOwner("Wilma", "Flinstone","123 Gravel Road");
    po2.setRefName(po2);
    po2.adoptPet(po2,pet3, 1);
    
    pet3.setOwner(po2);
    Pet pet4;
    pet4 = new Pet ("Dinosaur", "Barney","Plants");
    po2.adoptPet(po2,pet4, 2);
    pet4.setOwner(po2);
    po2.dump(po2);
    
   
   po1.removePet(pet2);
   
   
   
   
    //System.out.println(pet4.getOwner());
    
    //pet4.dumpPetInfo(pet4);
    
    //PetOwner.checkPetNames(po1);
    
    //PetOwner.resetPets(po1);
    
    /* Test Pet Onwer Get and Set
        String bob;
        bob = po1.getOwnerName();
        System.out.println(bob);
    
        po1.setNumPets(0);
        System.out.println (po1.getNumPets());
    */
    
    }
}
