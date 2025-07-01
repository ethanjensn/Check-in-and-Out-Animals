import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    //Arraylists to store data
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
	static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
    		char userInput = 0;

    		
        initializeDogList();
        initializeMonkeyList();
        
        //loop and inputs for Menu
        //each case assigns with number on menu
        while (userInput != 'q') {
        		Driver.displayMenu();
        		userInput = scnr.nextLine().charAt(0);
        		switch (userInput) {
        		case '1':
        			Driver.intakeNewDog(scnr);
        			break;
        		case '2':
        			Driver.intakeNewMonkey(scnr);
        			break;
        		case '3':
        			Driver.reserveAnimal(scnr);
        			break;
        		case '4':
        			Driver.printAnimals('4');
        			break;
        		case '5': 
        			Driver.printAnimals('5');
        			break;
        		case '6':
				Driver.printAnimals('6');
				break;
			default:
				System.out.println("Invalid input. Try again.");
				break;
				}
        		}
        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1= new Monkey("George", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", 
        		"6", "4", "15.3", "Capuchin");
        
        monkeyList.add(monkey1);
           }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        String breed;
        String gender;
        String age;
        String weight;
        String date;
        String country;
        String trainingStatus;
        Boolean reservation = null;
        String askForReservation;
        String service;
        
        // Add the code to instantiate a new dog and add it to the appropriate list
        // add dog into list if not in array
        
        //asking class questions
        System.out.print("What is your dog's breed?");
        breed = scnr.nextLine();
        System.out.print("What is your dog's gender?");
        gender = scnr.nextLine();
        System.out.print("What is your dog's age?");
        age = scnr.nextLine();
        System.out.print("What is your dog's weight?");
        weight = scnr.nextLine();
        // acquisitionDate
        System.out.print("What is today date?");
        date = scnr.nextLine();
        // acquisitionCountry
        System.out.print("What is the your country?");
        country = scnr.nextLine();
        // trainingStatus
        System.out.print("What is your dog's training status?");
        trainingStatus = scnr.nextLine();
        System.out.print("Is your dog reserved?");
        while (true) {
            askForReservation = scnr.nextLine();
	        	if(askForReservation.equals("yes")) {
	        		reservation = true;
	        		System.out.println("Reservation confirmed.");
	        		break;
	        }
	        else if (askForReservation.equals("no")){
	        		reservation = false;
	        		System.out.println("No reservation.");
	        		break;
	        } 
	        else {
	        		System.out.println("Invalid input, type yes or no");
	        		continue;
	        }
        }
        System.out.print("What country is your dog in service?");
        service = scnr.nextLine();
        
        //assigns class questions into dog class
        Dog dog = new Dog(name, breed, gender, age, weight, date, country, trainingStatus, reservation, service);
        dogList.add(dog);
        
        System.out.println();

    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
	        	
	    		String gender;
	    		String age;
	    		String weight;
	    		String date;
	    		String country;
	    		String trainingStatus;
	    		Boolean reservation = null;
	    		String askForReservation;
	    		String service;
	    		String tailLength;
	    		String height;
	    		String bodyLength;
	    		String species;	
	        	
	        // checks to see if name is already in list
	    		System.out.print("What is your monkey's name?");
		            String name = scanner.nextLine();
		            for(Monkey monkey: monkeyList) {
		                if(monkey.getName().equalsIgnoreCase(name)) {
		                    System.out.println("\n\nThis monkey is already in our system\n\n");
		                    return; //returns to menu
		                }
		            }
		            
           // add a for loop to see if species is in species list
		            
		   //checks to see if species is already in list
		    System.out.print("What is your monkey's species?");
		    
		    boolean isValid = false;
		    species = scnr.nextLine();
		    for(String monkeySpecies: Monkey.speciesList) {
		    		if(monkeySpecies.equalsIgnoreCase(species)) {
                    isValid = true;
                    break;
                }
            }
		    if (!isValid) {
		    	System.out.println("\n\nThis monkey is not the right species\n\n");
		    	return; //returns to menu
		    }

		    // asking class questions
        		System.out.print("What is your monkey's gender?");
        		gender = scnr.nextLine();
        		System.out.print("What is your monkey's age?");
        		age = scnr.nextLine();
        		System.out.print("What is your monkey's weight?");
        		weight = scnr.nextLine();
        		System.out.print("What is your monkey's tail length?");
        		tailLength = scnr.nextLine();
        		System.out.print("What is your monkey's height?");
        		height = scnr.nextLine();
        		System.out.print("What is your monkey's body length?");
        		bodyLength = scnr.nextLine();

        		// acquisitionDate
        		System.out.print("What is today date?");
        		date = scnr.nextLine();
        		// acquisitionCountry
        		System.out.print("What is the your country?");
        		country = scnr.nextLine();
        		// trainingStatus
        		System.out.print("What is your monkey's training status?");
        		trainingStatus = scnr.nextLine();
        		System.out.print("Is your monkey reserved?");
        		// loops until the correct answer is chosen
        		while (true) {
                 askForReservation = scnr.nextLine();
     	        	if(askForReservation.equals("yes")) {
     	        		reservation = true;
     	        		System.out.println("Reservation confirmed.");
     	        		break;
     	        }
     	        else if (askForReservation.equals("no")){
     	        		reservation = false;
     	        		System.out.println("No reservation.");
     	        		break;
     	        } 
     	        else {
     	        		System.out.println("Invalid input, type yes or no");
     	        		continue;
     	        }
             }
             System.out.print("What country is your monkey in service?");
             service = scnr.nextLine();
             
             // adds class questions to class and Arraylist
             Monkey monkey = new Monkey(name, gender, age, weight, date, country, trainingStatus, 
            		 reservation, service, tailLength, height, bodyLength, species);
             monkeyList.add(monkey);
             
             System.out.println();
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            String animalType;
            String serviceCountry;
            
        		System.out.println("Type your animal's type");
            animalType = scnr.nextLine();
            
            // loops until animal is found or not found
            // outerLoop breaks all loops once it reaches a break point
            outerLoop:
            while(true) {
            if(animalType.equals("dog")) {
        			System.out.println("Enter your dog's service country: ");
        			serviceCountry = scnr.nextLine();
        			for(Dog dog: dogList) {
        	            if(dog.getInServiceCountry().equalsIgnoreCase(serviceCountry)) {
        	                System.out.print("What is your dog's name?");
        	                String name = scanner.nextLine();
        	            		if(dog.getName().equalsIgnoreCase(name)) {
            	                System.out.println("\n\nWould You like to reserve your dog? Enter yes or no: \n\n");
            	                String reserveQuestion = scnr.nextLine();
            	                if(reserveQuestion.equalsIgnoreCase("yes")) {
            	                		dog.setReserved(true);
            	                		System.out.println("You have reserved your dog");
            	                		break outerLoop;
            	                } else if(reserveQuestion.equalsIgnoreCase("no")) {
            	                		dog.setReserved(false);
            	                		System.out.println("You have not reserved your dog");
            	                		break outerLoop;
            	                } else {
            	                		System.out.println("Invalid input try again");
            	                		continue;
            	                }
            	            }
            	        }
        			}
            }
            if(animalType.equals("monkey")) {
        			System.out.println("Enter your monkey's service country: ");
        			serviceCountry = scnr.nextLine();
        			for(Monkey monkey: monkeyList) {
        	            if(monkey.getInServiceCountry().equalsIgnoreCase(serviceCountry)) {
        	                System.out.print("What is your monkey's name?");
        	                String name = scanner.nextLine();
        	            		if(monkey.getName().equalsIgnoreCase(name)) {
            	                System.out.println("\n\nWould You like to reserve your monkey? Enter yes or no: \n\n");
            	                String reserveQuestion = scnr.nextLine();
            	                if(reserveQuestion.equalsIgnoreCase("yes")) {
            	                		monkey.setReserved(true);
            	                		System.out.println("You have reserved your monkey");
            	                		break outerLoop;
            	                } else if(reserveQuestion.equalsIgnoreCase("no")) {
            	                		monkey.setReserved(false);
            	                		System.out.println("You have not reserved your monkey");
            	                		break outerLoop;
            	                }else {
            	                		System.out.println("Invalid input try again");
            	                		continue;
            	                }
            	            }
            	        }
        			}
            }            
            }
        }
        


        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
        // Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	
        public static void printAnimals(char printChoice) {
        		//System.out.println("The method printAnimals needs to be implemented");
            	            
			switch (printChoice) {
			
			case '4':
                System.out.println("Printing the list of dogs");

                // iterates through the entire dog list
				for(Dog dog: dogList) {
            			System.out.println(dog.getName() + " " + dog.getBreed() + " " + dog.getGender() + " " 
            			+ dog.getAge() + " " + dog.getWeight() + " " + dog.getAcquisitionDate() + " " + dog.getAcquisitionLocation()
            			+ " " + dog.getTrainingStatus() + " " + dog.getReserved() + " " + dog.getInServiceCountry());
            			}
				
				break;
			
			case '5':
                System.out.println("Printing the list of monkeys");

                // iterates through the entire monkey list
	            for(Monkey monkey: monkeyList) {
	        			System.out.println(monkey.getName() + " " + monkey.getGender() + " " 
	                			+ monkey.getAge() + " " + monkey.getWeight() + " " + monkey.getAcquisitionDate() + " " + monkey.getAcquisitionLocation()
	                			+ " " + monkey.getTrainingStatus() + " " + monkey.getReserved() + " " + monkey.getInServiceCountry()
	                			+ " " + monkey.getTailLength() + " " + monkey.getHeight() + " " + monkey.getBodyLength()
	                			+ " " + monkey.getSpecies());        				
	        					} 
				
				break;
				
			case '6':
                System.out.println("Printing available");
	   
                // searches all list items that are not reserved or in service
	            	for(Dog dog: dogList) {
	            		// if there are in service and not reserved, then print
	            		if (dog.getTrainingStatus().equalsIgnoreCase("in service") && (!dog.getReserved())){
	            			System.out.println(dog.getName() + " " + dog.getBreed() + " " + dog.getGender() + " " 
	            			+ dog.getAge() + " " + dog.getWeight() + " " + dog.getAcquisitionDate() + " " + dog.getAcquisitionLocation()
	            			+ " " + dog.getTrainingStatus() + " " + dog.getReserved() + " " + dog.getInServiceCountry());
	            				}
	            			}
	            // searches all list items that are not reserved or in service
	            for(Monkey monkey: monkeyList) {
            		// if there are in service and not reserved, then print
	        		if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && (!monkey.getReserved())){
	        			System.out.println(monkey.getName() + " " + monkey.getGender() + " " 
	                			+ monkey.getAge() + " " + monkey.getWeight() + " " + monkey.getAcquisitionDate() + " " + monkey.getAcquisitionLocation()
	                			+ " " + monkey.getTrainingStatus() + " " + monkey.getReserved() + " " + monkey.getInServiceCountry()
	                			+ " " + monkey.getTailLength() + " " + monkey.getHeight() + " " + monkey.getBodyLength()
	                			+ " " + monkey.getSpecies());
	        			}
	        		} 
	            
	            break;
			}
        }
}
