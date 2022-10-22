import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
        	displayMenu();
        	choice = scanner.nextLine();
        	if (choice == '1') {
        		intakeNewDog(scanner);
        	}
        	else if (choice == '2') {
        		intakeNewMonkey(scanner);
        	}
        	else if (choice == '3') {
        		reserveAnimal(scanner);
        	}
        	else if (choice == '4') {
        		printAnimals("dog");
        	}
        	else if (choice == '5') {
        		printAnimals("monkey");
        	}
        	else if (choice == '6') {
        		printAnimals("available");
        	}
        	else if (choice == 'q') { 
        		System.out.println("Quitting Application.");
        	}
        	else {
        		System.out.println("Invalid Input. Try again.");
        	} while (choice != 'q');
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        }
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
    	Monkey monkey1 = new Monkey("Roger", "Capuchin", "2", "5", "4", "male", "2", "10", "5/3/2020", "United States", "intake", false, "United States");
    	Monkey monkey2 = new Monkey("Dory", "Tamarin", "1", "3", "2", "female", "4", "11", "6/21/2021", "Canada", "in service", true, "Canada");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
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
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved?");
        boolean reserved = scanner.nextBoolean();
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
        acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        
        dogList.add(newDog);

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            }
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            System.out.println("Is the monkey reserved?");
            boolean reserved = scanner.nextBoolean();
            System.out.println("What is the monkey's service country?");
            String inServiceCountry = scanner.nextLine();
            System.out.println("How long is the monkey's tail?");
            String tailLength = scanner.nextLine();
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            
            Monkey newMonkey = new Monkey(name, species, tailLength, height, bodyLength, gender,
            age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            
            monkeyList.add(newMonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	System.out.println("Enter animal type: ");
        	String animalType = scanner.nextLine();
        	if (animalType.equalsIgnoreCase("Monkey")) {
        		System.out.println("Enter the monkey's country of aquisition: ");
        		String country = scanner.nextLine();
        		for (Monkey obj: monkeyList) {
        			if (obj.getAquisitionLocation().equalsIgnoreCase(country)) {
        				obj.setReserved(true);
        				System.out.println("This monkey is now reserved.");
        				return;
        			}
        		}
        		System.out.println("The monkey entered is not in the list.");
        	}
        	else if (animalType.equalsIgnoreCase("Dog")) {
        		System.out.println("Enter the dog's country of aquisition: ");
        		String country = scanner.nextLine();
        		for (Dog obj: dogList) {
        			if (obj.getAquisitionLocation().equalsIgnoreCase(country)) {
        				obj.setReserved(true);
        				System.out.println("The dog is now reserved.");
        				return;
        			}
        		}
        		System.out.println("The dog entered is not in the list");
        	}
        	else {
        		System.out.println("Type not found.");
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
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char choice) {
            if (choice == '4') {
            	System.out.println(dogList);
            }
            else if (choice == '5') {
            	System.out.println(monkeyList);
            }
            else if (choice == '6') {
            	for (int i = 0; i < dogList.size(); i++) {
            		if (dogList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && dogList.get(i).getReserved()==false) {
            			System.out.println(dogsList.get(i));
            			// Prints in service and available dogs.
            		}
            	}
            	for (int i = 0; i < dogList.size(); i++) {
            		if (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && monkeyList.get(i).getReserved()==false) {
            			System.out.println(monkeyList.get(i));
            			// Prints in service and available monkeys.
            		}
            	}
            }

        }
}

