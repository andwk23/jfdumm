package Kapitel_04;

import javax.swing.JFrame;

public class Referenztypen {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		String myTitle = "Leerer Frame - (600, 400)";

		myFrame.setTitle(myTitle);
		myFrame.setSize(600, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}
