import javax.swing.JOptionPane;
import java.util.Arrays;
public class RandomApp {
    public static void main(String[] args) {
        String title = "Guessing Game";
        boolean tryAgain=true;
        Random rd;
        rd=new Random();

        while (tryAgain){
            rd.reset();
            rd.newRandom();

            for (int i=2;i>=0;i--) {
                int userInput = Integer.parseInt(
                    JOptionPane.showInputDialog(null,"Guess a number between 1 and 10",title, JOptionPane.QUESTION_MESSAGE)
                );

                rd.setUserInput(userInput);
                rd.computeRandom();
                JOptionPane.showMessageDialog(null,"The computer says "+rd.getRandom(),title, JOptionPane.INFORMATION_MESSAGE);

                rd.getStr();
                if (rd.getStr().equals("Winner")) {
                    JOptionPane.showMessageDialog(null, rd.getStr(),title, JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                else if (i>0) {
                    JOptionPane.showMessageDialog(null,"Have "+i+" turns left",title, JOptionPane.INFORMATION_MESSAGE);
                    rd.newRandom();
                }
                else {
                    JOptionPane.showMessageDialog(null, rd.getStr(),title, JOptionPane.INFORMATION_MESSAGE);
                }
            }

            JOptionPane.showMessageDialog(null, "Your guesses: "+Arrays.toString(rd.getAttempts()),title, JOptionPane.INFORMATION_MESSAGE);
            int response=JOptionPane.showConfirmDialog(
                null, "Try again?", title, JOptionPane.YES_NO_OPTION
            );
            tryAgain=(response==JOptionPane.YES_OPTION);

        }
        JOptionPane.showMessageDialog(null, "Thank you for playing",title, JOptionPane.INFORMATION_MESSAGE);
    }
}