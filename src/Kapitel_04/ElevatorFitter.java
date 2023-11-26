package Kapitel_04;

public class ElevatorFitter {

	public static void main(String[] args) {
		int weightOfAPerson;
		int elevatorWeightLimit;
		int numberOfPeople;
		weightOfAPerson = 150;      
		elevatorWeightLimit = 1400;      
		numberOfPeople = elevatorWeightLimit / weightOfAPerson;
		
		System.out.print("Es passen ");
		System.out.print(numberOfPeople);
		System.out.println(" Personen in den Fahrstuhl.");

	}

}
