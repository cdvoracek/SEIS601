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

    private String FirstName,
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
    private PetOwner refName;
    static int numberOwners;

//private String like leaf in binary
    // Owner Constructor
    PetOwner(String FirstName, String LastName, String Address) //boolean hasPet,int numPets, boolean hasOwnedPets, int numHistoricalPets
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
        this.refName = null; //store a reference to the PetOwner name.






    }

    public void setRefName(PetOwner refName) {
        this.refName = refName;
        //add PetOnwer to array

        PetOwner[] aryPetOwners;
        aryPetOwners = new PetOwner[20];
        int aryNum = numberOwners;
        PetOwner ownerStore;
        ownerStore = this.refName;
        aryPetOwners[aryNum] = ownerStore;
        numberOwners++;
        

    }

    private void updateData() {
        //reset numPets to 0 before counting
        numPets = 0;
        if (petOne != null) {
            numPets++;
        }
        if (petTwo != null) {
            numPets++;
        }
        if (petThree != null) {
            numPets++;
        }
        if (petFour != null) {
            numPets++;
        }
        if (petFive != null) {
            numPets++;
        }
        //System.out.println("Number of Pets: " + numPets);
        if (numPets > 0) {
            hasPet = true;
        } else {
            hasPet = false;
        }

        numHistoricalPets++;

        //System.out.println(numHistoricalPets);
    }

    //get Methods
    public String getOwnerName() {
        return (LastName + ", " + FirstName);

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public int getNumPets() {
        return numPets;
    }

    public boolean isHasOwnedPet() {
        return hasOwnedPet;
    }

    public boolean getPet(String type, String name) {

        
        int num;
        String str1, str2;
        Pet search;
        for i from 1-5, while <6, i++
            switch (num)
                case 1: search = petOne;
                        str1 = search.getPetName();
                        str2 = search.getPetType();
                case 2: search = petTwo;
                        str1 = search.getPetName();
                        str2 = search.getPetType();
                case 3: search = petThree;
                        str1 = search.getPetName();
                        str2 = search.getPetType();
                case 4: search = petFour;
                        str1 = search.getPetName();
                        str2 = search.getPetType();
                case 5: search = petFive;
                        str1 = search.getPetName();
                        str2 = search.getPetType();
                else ; 
            i++; //up count I then return.  
            //if (search !=null)
            { if (search.getPetNames())==.    return true
                    then i=6
            }
        



                    
            
    }

    public static void checkPetNames(PetOwner po) {
        if (po.petOne != null) {
            System.out.println("Pet One:" + (po.petOne).getPetNames());
        }
        if (po.petTwo != null) {
            System.out.println("Pet Two:" + (po.petTwo).getPetNames());
        }
        if (po.petThree != null) {
            System.out.println("Pet Three:" + (po.petThree).getPetNames());
        }
        if (po.petFour != null) {
            System.out.println("Pet Four: " + (po.petFour).getPetNames());
        }
        if (po.petFive != null) {
            System.out.println("Pet Five:" + (po.petFive).getPetNames());
        }
    }

    public void adoptPet(PetOwner on, Pet pet, int numPet) {

        switch (numPet) {
            case 1:
                on.petOne = pet;
                break;
            case 2:
                on.petTwo = pet;
                break;
            case 3:
                on.petThree = pet;
                break;
            case 4:
                on.petFour = pet;

            case 5:
                on.petFive = pet;

        }




        setHasOwnedPet(true);
        updateData();


    }

    public void removePet(Pet p) {
        String pname = p.getPetName();
        //System.out.println (pname);
        //System.out.println (this.petOne.getPetName());
        String str0 = p.getPetName();
        if (this.petOne != null)
        {
            String str1 = this.petOne.getPetName();
            if (compare(str0, str1))
            {p.removeOwner(p);
            this.petOne = null;}
        }

        if (this.petTwo != null)
        {
            String str2 = this.petTwo.getPetName();
            boolean bool = compare(str0,str2);
            if (compare(str0, str2))
            {p.removeOwner(p);
            this.petTwo = null;
           
            }
        }

        if (this.petThree != null)
        {
            String str3 = this.petThree.getPetName();
            if (compare(str0, str3))
            {p.removeOwner(p);
            this.petThree = null;}
        }

        if (this.petFour != null)
        {
            String str4 = this.petFour.getPetName();
            if (compare(str0, str4))
            {p.removeOwner(p);
            this.petFour = null;}
        }
        
        if (this.petFive != null)
        {
            String str5 = this.petFive.getPetName();
            if (compare(str0, str5))
            {p.removeOwner(p);
            this.petFive = null;}
        }
    
     numPets--;
     this.numPets = numPets;
     

    }

    public boolean compare(String str1, String str2) {
        return (str1 == null ? str2 == null : str1.equals(str2));
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public void setNumPets(int numPets) {
        this.numPets = numPets;
    }

    public void setHasOwnedPet(boolean hasOwnedPet) {
        this.hasOwnedPet = hasOwnedPet;
    }

    public static void resetPets(PetOwner rowner) {
        //used to clear data for testing
        rowner.petOne = null;
        rowner.petTwo = null;
        rowner.petThree = null;
        rowner.petFour = null;
        rowner.petFive = null;
        rowner.numHistoricalPets = 0;
        rowner.hasOwnedPet = false;
        rowner.hasPet = false;





    }

    public void dumpOwnerDetails(PetOwner p) {
        System.out.println("Owner First Name\t\t\t: " + p.FirstName);
        System.out.println("Owner Last Name\t\t\t\t: " + p.LastName);
        System.out.println("Owner Address\t\t\t\t: " + p.Address);
        System.out.println("Owner Number of Current Pets\t\t: " + p.numPets);
        System.out.println("Owner Currently Has a Pet\t\t: " + p.hasPet);
        System.out.println("Owner Has Ever Owned a Pet\t\t: " + p.hasOwnedPet);
        System.out.println("Owner Number of Current-and-Past Pets\t: " + p.numHistoricalPets);


    }

    public void dumpPetDetails(PetOwner p) {
        if (p.petOne != null) {
            System.out.println("\tPet Type:  " + (p.petOne).getPetType());
            System.out.println("\tPet Name:  " + (p.petOne).getPetName());
            System.out.println("\tPet Food:  " + (p.petOne).getPetFood());
            System.out.println();
        }

        if (p.petTwo != null) {
            System.out.println("\tPet Type:  " + (p.petTwo).getPetType());
            System.out.println("\tPet Name:  " + (p.petTwo).getPetName());
            System.out.println("\tPet Food:  " + (p.petTwo).getPetFood());
            System.out.println();
        }

        if (p.petThree != null) {
            System.out.println("\tPet Type:  " + (p.petThree).getPetType());
            System.out.println("\tPet Name:  " + (p.petThree).getPetName());
            System.out.println("\tPet Food:  " + (p.petThree).getPetFood());
            System.out.println();
        }

        if (p.petFour != null) {
            System.out.println("\tPet Type:  " + (p.petFour).getPetType());
            System.out.println("\tPet Name:  " + (p.petFour).getPetName());
            System.out.println("\tPet Food:  " + (p.petFour).getPetFood());
            System.out.println();
        }
        if (p.petFive != null) {
            System.out.println("\tPet Type  :" + (p.petFive).getPetType());
            System.out.println("\tPet Name  :" + (p.petFive).getPetName());
            System.out.println("\tPet Food  :" + (p.petFive).getPetFood());
            System.out.println();
        }
    }

    public void dump(PetOwner pd) {
        dumpOwnerDetails(pd);
        dumpPetDetails(pd);


    }
}
