package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
String pie=JOptionPane.showInputDialog("how many nickels do you have?");
        // Convert their answer to an int using Integer.parseInt()
int lol=Integer.parseInt(pie);
        // Ask the user how many dimes they have, and convert their answer
String pop=JOptionPane.showInputDialog("how many dimes do you have?");
       int ioi=Integer.parseInt(pop);
		// Ask the user how many quarters they have, and convert their answer
String kok=JOptionPane.showInputDialog("how many quarters do you have");
       int mom=Integer.parseInt(kok);
		// Calculate how much money the user has and save it in a double variable 
 double sam=lol*.05;
 double joj=ioi*.10;
 double uou=mom*.25;
 
 		// Tell the user how much money they have
double wqw=sam+joj+uou;
JOptionPane.showMessageDialog(null, "you have "+wqw);
    }
}