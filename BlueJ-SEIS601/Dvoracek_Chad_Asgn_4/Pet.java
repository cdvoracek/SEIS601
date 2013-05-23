
/**
 * This class contains the informaton and sub-classes
 * for the pets.
 * 
 * The fields within this class are private.  Any changes made to 
 * each pet must be done with accessors and mutators.  A pet can be created and
 * then adopted by an owner.  Each pet stores vital information include
 * knowledge of its owner. 
 * 
 * 
 * @author Chad Dvoracek 
 * @version 2013-05-03
 */
public class Pet 
{

private String PetType;
private String PetName;
private String PetFood;
private PetOwner Owner;

/** This class is the pet constructor.
 *  It will created the each pet as it is called taking
 *  the parameters of pet type, pet name, and pet food.  
 */
 // Pet Constructor
        Pet (String PetType, String PetName, String PetFood)
        {
        
        this.PetName   =PetName;    
        this.PetType   =PetType;
        this.PetFood   =PetFood;
        this.Owner     =Owner;
        
        //System.out.println(PetType);
        //System.out.println(PetName);
        //System.out.println(PetFood);
        }

    /** The following are getters for the pet class
     * 
     */ 
        
   
    public String getPetType() {
        return PetType;
    }

    public String getPetName() {
        return this.PetName;
    }

    public String getPetNames()
    {
        
    return this.PetName;   
    }
    
    public String getPetFood() {
        return PetFood;
    }

    public String getOwner() {
        return (Owner).getFirstName()+" "+(Owner.getLastName());
    }
   
    
   /** The next series of methods will change the values in the private fields.
    * 
    */
    public void setPetType(String PetType) {
        this.PetType = PetType;
    }

    public void setPetName(String PetName) {
        this.PetName = PetName;
    }

    public void setPetFood(String PetFood) {
        this.PetFood = PetFood;
    }

    
    /** The class is called as the owner adopts the pet.
     * It established ownership and stores the over value in the
     * instance of the pet.  
     */
    public void setOwner(PetOwner Owner) {
        this.Owner = Owner;
    }
    
    /** This class will set the owner to null, essentiall removing the owner from the pet.  
     * 
     */
    public void removeOwner(Pet pt)
    {
    pt.Owner = null;
    
    
    }
    
    /** The final method is used to print out pet details and can be called in
     * combination with the printing of owner details or on its own.  
     */
    public void dumpPetInfo(Pet pt)
    {
            System.out.println("\tPet Type:  " + pt.getPetType());
            System.out.println("\tPet Name:  " + pt.getPetName());
            System.out.println("\tPet Food:  " + pt.getPetFood());
            System.out.println("\tPet Owner: " + pt.getOwner());
            System.out.println();
    }
    
}
