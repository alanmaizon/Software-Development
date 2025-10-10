import javax.swing.JOptionPane;
public class RandomApp {
    public static void main(String[] args) {
        int userInput;

        Random rd;
        rd=new Random();

        userInput=Integer.parseInt (JOptionPane.showInputDialog("Guess a Number between 1 and 10"));
        rd.setUserInput(userInput);
        rd.computeRandom();

        JOptionPane.showMessageDialog(null, "The computer says "+rd.getRandom());
        JOptionPane.showMessageDialog(null, rd.getStr());
    }
}