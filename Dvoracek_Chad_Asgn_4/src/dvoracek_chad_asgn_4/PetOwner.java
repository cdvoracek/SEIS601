/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_4;

/**
 *
 * @author Chad
 */
public class PetOwner {

    private String  FirstName,
                    LastName,
                    Address;
    private boolean hasPet;
    private int numPets,
                numHistoricalPets;
    private boolean hasOwnedPet;
    private Pet petOne,
                petTwo,
                petThree,
                petFour,
                petFive;
//private String like leaf in binary

    // Owner Constructor
    PetOwner(String FirstName, String LastName, String Address) 
    //boolean hasPet,int numPets, boolean hasOwnedPets, int numHistoricalPets
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        hasPet = false;
        numPets = 0;
        hasOwnedPet = false;
        numHistoricalPets = 0;
        this.petOne = null;
        this.petTwo = null;
        this.petThree = null;
        this.petFour = null;
        this.petFive = null;
        
        

    }
    
    
    
    
    private void updateData()
    {
    //reset numPets to 0 before counting
    numPets = 0;
    if (petOne!=null) numPets++;
    if (petTwo!=null) numPets++;
    if (petThree!=null) numPets++;
    if (petFour!=null) numPets++;
    if (petFive!=null) numPets++;
    System.out.println ("Number of Pets: "+numPets);
    if (numPets>0) 
        hasPet = true;
                else hasPet = false;
    
    numHistoricalPets++;
    
    System.out.println (numHistoricalPets);
    }
    
    
   
    //get Methods
    public String getOwnerName() 
    {
        return (LastName + ", " + FirstName);

    }

    public String getFirstName() 
    {
        return FirstName;
    }

    public String getLastName() 
    {
        return LastName;
    }

    public String getAddress() 
    {
        return Address;
    }

    public boolean isHasPet() 
    {
        return hasPet;
    }

    public int getNumPets() 
    {
        return numPets;
    }

    public boolean isHasOwnedPet() 
    {
        return hasOwnedPet;
    }
    
    public static void checkPetNames (PetOwner po)
    {
     if (po.petOne !=null) 
         System.out.println ("Pet One:"+ (po.petOne).getPetNames() );
     if (po.petTwo !=null)
         System.out.println ("Pet Two:"+ (po.petTwo).getPetNames() );  
     if (po.petThree !=null)
         System.out.println ("Pet Three:"+(po.petThree).getPetNames() );   
     if (po.petFour !=null)
         System.out.println ("Pet Four: "+(po.petFour).getPetNames() );    
     if (po.petFive !=null)
         System.out.println ("Pet Five:"+ (po.petFive).getPetNames() );    
    }
    
  
    public void adoptPet(PetOwner on, Pet pet, int numPet)
    {
           
    switch (numPet)
    {
        case 1: on.petOne =pet;
                break;
        case 2: on.petTwo =pet;
                break;
        case 3: on.petThree =pet;
                break;
        case 4: on.petFour = pet;
    
        case 5: on.petFive = pet;
            
    }
     
   
     
     //else this.petThree=pet;
     
   
     //this.petTwo = pet;
     
     /*else if (on.petTwo!=null) this.petTwo =pet;
     else if (on.petThree!=null) this.petThree = pet;
     else if (on.petFour!=null) this.petFour = pet;
     else if (on.petFive!=null) this.petFive = pet;
     else System.out.println ("Owner has too many pets.");
      */  
     //this.petOne= pet;
     setHasOwnedPet (true);
     updateData();
            
    
    }
    
    public void setFirstName(String FirstName) 
    {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) 
    {
        this.LastName = LastName;
    }

    public void setAddress(String Address) 
    {
        this.Address = Address;
    }

    public void setHasPet(boolean hasPet) 
    {
        this.hasPet = hasPet;
    }

    public void setNumPets(int numPets) 
    {
        this.numPets = numPets;
    }

    public void setHasOwnedPet(boolean hasOwnedPet) 
    {
        this.hasOwnedPet = hasOwnedPet;
    }
    
    public static void resetPets(PetOwner rowner)
    {
        //used to clear data for testing
        rowner.petOne= null;
        rowner.petTwo= null;
        rowner.petThree= null;
        rowner.petFour = null;
        rowner.petFive = null;
        rowner.numHistoricalPets=0;
        rowner.hasOwnedPet = false;
        rowner.hasPet = false;
       
        
        
                
        
    }
   
    public void dump()
    {
    System.out.println ("Pet Name:"+ petOne.getPetName());   
        
    }
    }
