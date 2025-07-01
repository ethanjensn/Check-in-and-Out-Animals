import java.util.ArrayList;

public class Monkey extends RescueAnimal {
	// Instance variable
	// needs tail length, height, body length, and species. 
	
	// added list for species that are accepted
    public static ArrayList<String> speciesList = new ArrayList<String>();

	private String tailLength;
    private String height;
    private String bodyLength;
    private String species;
	
    // Constructor
    public Monkey(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, 
	String height, String bodyLength, String species) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		setAnimalType("monkey"); // This line ensures animalType is set.
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		}
    
    static {
    speciesList.add("Capuchin");
    speciesList.add("Guenon");
    speciesList.add("Macaque");
    speciesList.add("Marmoset");
    speciesList.add("Squirrel monkey");
    speciesList.add("Tamarin");
    }
    
    //Constructors (setter and getter methods)
    public void setTailLength(String tailLength) {
    	this.tailLength = tailLength;
    }
    
    public String getTailLength() {
    	return tailLength;
    }
    
    public void setHeight(String height) {
    	this.height = height;
    }
    
    public String getHeight() {
    	return height;
    }
    
    public void setBodyLength(String bodyLength) {
    	this.bodyLength = bodyLength;
    }
    
    public String getBodyLength() {
    	return bodyLength;
    }
    
    public void setSpecies(String species) {
    	this.species = species;
    }
    
    public String getSpecies() {
    	return species;
    }
    
}
