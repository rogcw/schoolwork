package pack;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class AssignmentOne {

	public static void main(String [] args) throws FileNotFoundException{
		
		//input the file and declare the amount of shelters to be processed
		//We maintain one file copy and simply pass its information as needed to any Shelter objects we want
		
		File file = new File("C:\\Users\\rogcw\\Desktop\\file.txt");
		Scanner scan = new Scanner(file);
		final int numShelters = scan.nextInt();
		
		//Create an array of Shelter objects and iterate them. 
		//Each shelter object retains info. such as a spend record, population size, and amount of money exchanged
		//It will also allow us to iteratively perform operations on each shelter object.
		
		Shelter[] slum = new Shelter[numShelters];
		
		for(Shelter building : slum) {
			building = new Shelter();
			building.readShelterInfo(file, scan);
			building.computeMinMoney();
			building.printMoneyExchanged();
		}
		scan.close();
	}
}

class Shelter{
	
	private int numPeople;
	private ArrayList <Double> amountSpentPerPerson = new ArrayList<Double>();
	private double taxes;

	void readShelterInfo(File file, Scanner scan) throws FileNotFoundException{
		
		if(scan.hasNextInt()) {
			//population of a particular shelter
			this.numPeople = scan.nextInt();
			
			//what each shelter member spent
			for(int i = 0; scan.hasNextDouble() && i+1 <= numPeople; i++) {
				amountSpentPerPerson.add(scan.nextDouble());
			}
		}
	}
	void computeMinMoney() {
		
		double total = 0;
		for(int i = 0; i+1 <= numPeople; i++) {
			//get population size
			total += amountSpentPerPerson.get(i);
		}
		double avg = Math.round((total/numPeople)*100.0)/100.0;
		
		for(int i = 0; i+1 <= numPeople; i++) {
			if( amountSpentPerPerson.get(i) > avg) {
				//do not care if equal or below the moving average
				this.taxes += amountSpentPerPerson.get(i) - avg;
			}
		}
		this.taxes = Math.round(taxes*100.0)/100.0;
	}
	void printMoneyExchanged() {
		System.out.println("Minimum amount of money exchanged: $" + this.taxes);
	}
}
