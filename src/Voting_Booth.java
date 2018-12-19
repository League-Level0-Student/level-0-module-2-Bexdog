import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String bob = JOptionPane.showInputDialog("How old are you? (in years)");	
	int Bob = Integer.parseInt(bob);
	if(Bob>17){
String bibliboblibo =	JOptionPane.showInputDialog("who do you think the next president should be?");
String userHomeFolder = System.getProperty("user.home");
File textFile = new File(userHomeFolder, "mytext.txt");

try {
	BufferedWriter out = new BufferedWriter(new FileWriter(textFile));
} catch(IOException e){
	
}
	}
	else {
		JOptionPane.showMessageDialog(null, "no one cares what you think");
	}
	
}
}
