import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String bob = JOptionPane.showInputDialog("How tall are you? /(in inches)");
int Bob = Integer.parseInt(bob);
if(Bob >= 48){
	JOptionPane.showMessageDialog(null, "you can go on the rollercoaster");
}
else {
	JOptionPane.showMessageDialog(null, "you can't go on the rollercoaster");
}
	
}
	
	
	
}
