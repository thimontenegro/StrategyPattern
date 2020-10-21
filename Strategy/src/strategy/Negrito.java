package strategy;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Negrito implements Strategy {

	public String fixString(String text) {
		// TODO Auto-generated method stub
		String result = "Texto em Negrito: " + text;
		return result;
	}

}
