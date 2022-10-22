
public class Monkey extends RescueAnimal{
	// Instance Variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// Constructor 
	public Monkey(String name, String species, String tailLength,
	String height, String bodyLength, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}
	
	// Accessor Methods
	public String getSpecies() {
		return species;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	//Mutator Methods
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    
    public void setHeight(String monkeyHeight) {
    	height = monkeyHeight;
    }
    
    public void setBodyLenght(String monkeyBodyLength) {
    	bodyLength = monkeyBodyLength;
    }
    
    public void setTailLength(String monkeyTailLength) {
    	tailLength = monkeyTailLength;
    }
}
