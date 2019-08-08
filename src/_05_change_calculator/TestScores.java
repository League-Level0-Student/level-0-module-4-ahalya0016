package _05_change_calculator;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	double numScore = Double.parseDouble(score);
	if (numScore > 75.0) {
		JOptionPane.showMessageDialog(null, "Good job!");	
	}
	else {
		JOptionPane.showMessageDialog(null, "Better luck next time");
	}
		
	
}
}

