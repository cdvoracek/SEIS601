/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_4;

/**
 *
 * @author Chad
 */
public class Pet 
{

private String PetType;
private String PetName;
private String PetFood;



 // Pet Constructor
        Pet (String PetType, String PetName, String PetFood)
        {
        
        this.PetName   =PetName;    
        this.PetType   =PetType;
        this.PetFood   =PetFood;
        
        
        //System.out.println(PetType);
        //System.out.println(PetName);
        //System.out.println(PetFood);
        }

     
        
    //Get Pet
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
 
    //Set Pet
    public void setPetType(String PetType) {
        this.PetType = PetType;
    }

    public void setPetName(String PetName) {
        this.PetName = PetName;
    }

    public void setPetFood(String PetFood) {
        this.PetFood = PetFood;
    }
    
    
}
