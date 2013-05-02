/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_4;

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
    
    po1.adoptPet(po1,pet1, 1);
    
    Pet pet2;
    pet2 = new Pet ("Cat", "Tommy","Fish");
    po1.adoptPet(po1,pet2, 2);
    
    po1.dump(po1);
    
    
    
    
    
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
