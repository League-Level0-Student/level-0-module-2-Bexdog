//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int number = new Random().nextInt(4);
	// 3. Print out this variable
//JOptionPane.showMessageDialog(null, number);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a 'Yes or No' queston");
	// 5. If the random number is 0
if(number==0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "YES");
}// 6. If the random number is 1
else if(number==1) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "no");
}// 7. If the random number is 2
else if(number==2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
}// 8. If the random number is 3
else {
	// -- write your own answer
	JOptionPane.showMessageDialog(null, "ask Yo Mama");
}
}
}
