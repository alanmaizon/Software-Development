//create an application that takes in 3 numbers from a user
//the app should then multiply each of those numbers by 9
//the user should be shown the new multiplied values 
import javax.swing. JOptionPane;
public class NumbersApp {
    public static void main (String[] args) {
        //vars
        int[] initialNumbers;
        initialNumbers=new int[3];
        int[] finalNumbers;
        //declare objects
        Numbers n;
        n=new Numbers ();
        //input
        for (int i=0; i<initialNumbers.length;i++) {
            initialNumbers[i]=Integer.parseInt (JOptionPane.showInputDialog (null, "Enter a number")) ;
        }
        //set
        n.setInitialNumbers (initialNumbers) ;
        //compute
        n.computeFinalNumbers ();
        // get
        finalNumbers=n.getFinalNumbers () ;
        //output
        for (int i=0;i<initialNumbers.length;i++) {
            JOptionPane.showMessageDialog(null,initialNumbers[i]+" times 9 is "+finalNumbers[i]);
        }
    }
}