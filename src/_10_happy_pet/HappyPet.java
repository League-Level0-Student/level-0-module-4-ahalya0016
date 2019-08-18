package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String x = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
int HappinessLevel = 0;
int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String [] { "Take your pet for a walk", "Groom your pet", "Feed your pet" }, null);
if (task == 2) {
	JOptionPane.showMessageDialog(null, "Your pet is eating quickly");
	}
	if (task == 1) {
	JOptionPane.showMessageDialog(null, "Your pet is happy");
	}
	if (task ==0) {
	JOptionPane.showMessageDialog(null, "Your pet is running fast");
	}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			//int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					//new String[] { "Button 1", "Button 2", "Button 3" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}}