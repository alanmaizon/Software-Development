import javax.swing.JOptionPane;
public class RandomApp {
    public static void main(String[] args) {
        Random rd;
        rd=new Random();
        rd.newRandom();

        for (int i=2;i>=0;i--) {
            int userInput = Integer.parseInt(
                JOptionPane.showInputDialog("Guess a number between 1 and 10")
            );

            rd.setUserInput(userInput);
            rd.computeRandom();
            JOptionPane.showMessageDialog(null,"The computer says "+rd.getRandom());
            
            rd.getStr();
            if (rd.getStr().equals("Winner")) {
                JOptionPane.showMessageDialog(null, rd.getStr());
                break;
            }
            else if (i>0) {
                JOptionPane.showMessageDialog(null,"Have "+i+" turns left");
                rd.newRandom();
            }
            else {
                JOptionPane.showMessageDialog(null, rd.getStr());
            }
        }
    }
}