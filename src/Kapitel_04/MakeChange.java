package Kapitel_04;

public class MakeChange {

	public static void main(String[] args) {
		int total = 248;
        int quarters = total / 25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;
        
        int nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int cents = whatsLeft;

        System.out.println("Sie wechseln " + total + " $-Cents in");
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickels + " Nickels");
        System.out.println(cents + " Cents");
        System.out.println();

	}

}
