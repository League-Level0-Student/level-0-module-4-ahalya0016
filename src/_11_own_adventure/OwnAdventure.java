package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	int story = JOptionPane.showOptionDialog(null, "Bob comes accross a phone on the sidewalk and it is ringing. What does he do?", "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Walk away", "Turn the phone into the authorities", "Answer the phone" }, null);
System.out.println(story);
	if (story = 2)	{
	int story1 = JOptionPane.showOptionDialog(null, "Bob walks away but is stopped by a ...", "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
	new String[] { "Police officer", "His friend", "Stranger on the street" }, null);
}
if (story = 1) {
	int story2 = JOptionPane.showOptionDialog(null, "Bob gives the phone to the police officer, who", "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Accuses him of stealing the phone", "Takes the phone and thanks Bob", "Tells Bob the phone belongs to himself" }, null);
}
if (story = 0) {
	int story3 = JOptionPane.showOptionDialog(null, "Bob answers the phone and..., "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "There is no one on the other end", "He recognizes the voice on the other end", "He hears a scary voice on the other end" }, null);	
}
}}