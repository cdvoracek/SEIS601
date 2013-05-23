
/**
 * This is the main App to control the program.
 * The application will create pets, owners, and link them together
 * and the owner adopts pets or gets rid of them.  
 * 
 * Through constructors and mutators changes can be made to the values
 * the private fields.  
 * 
 * 
 * @author Chad Dvoracek 
 * @version 2013-05-03 
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
     
   
    Pet pet1;
    pet1 = new Pet("dragon","Puff", "Knights of the Round Table");
        
    PetOwner po1;
    po1 = new PetOwner("Jackie", "Paper","123 Main Street");
    po1.setRefName(po1);
        
    po1.adoptPet(po1,pet1, 1);
    pet1.setOwner(po1);
    
    Pet pet2;
    pet2 = new Pet ("cat", "Tommy","Fish");
    po1.adoptPet(po1,pet2, 2);
    pet2.setOwner(po1);
    po1.dump(po1);
    //System.out.println(pet2.getOwner());
    
    
    //start pet set 2
    
    Pet pet3;
    pet3 = new Pet("dinosaur","Dino", "Brontosaurus Steaks");
        
    PetOwner po2;
    po2 = new PetOwner("Wilma", "Flinstone","123 Gravel Road");
    po2.setRefName(po2);
    po2.adoptPet(po2,pet3, 1);
    
    pet3.setOwner(po2);
    Pet pet4;
    pet4 = new Pet ("dinosaur", "Barney","Plants");
    po2.adoptPet(po2,pet4, 2);
    pet4.setOwner(po2);
    po2.dump(po2);
    
    System.out.println("Find pet Tommy the cat.");
        try {
            boolean findPet = po1.getPet("cat", "Tommy");
            } catch (Exception ex) {
            System.out.println("Owner does not have this pet.\r"
                    + "Pet name and type are case sensitive.\r"
                    + "Check spelling.\r");
        }
        try {
            po1.removePet(pet2);
           } catch (Exception ex) {
            System.out.println("No such pet "+pet2.getPetName());
        }            
    System.out.println("Find pet Puff the dragon.");
         try {
            
             boolean  findPet = po1.getPet("dragon", "Puff");
            } catch (Exception ex) {
            System.out.println("Owner does not have this pet.\r"
                    + "Pet name and type are case sensitive.\r"
                    + "Check spelling.");
        }
        
        pet1.setPetFood("Knights in shining armor");
        
        po1.dump(po1);
         System.out.println("Find pet Dino the dinosaur.");
         try {
            
             boolean  findPet = po2.getPet("dinosaur", "Dino");
            } catch (Exception ex) {
            System.out.println("Owner does not have this pet.\r"
                    + "Pet name and type are case sensitive.\r"
                    + "Check spelling.");
        }
        
          try {
            po2.removePet(pet3);
           } catch (Exception ex) {
            System.out.println("No such pet "+pet3.getPetName());
        }           
        po2.dump(po2);
           System.out.println("Try to get pet Dino again.");
         try {
            po1.removePet(pet3);
           } catch (Exception ex) {
            System.out.println("No such pet "+pet3.getPetName());
        }          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
