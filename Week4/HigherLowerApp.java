import javax.swing.JOptionPane;
public class HigherLowerApp {
    public static void main(String[] args) {
        int randomNum = (int)((Math.random() * 20) + 1);
        String msg;

        HigherLower hl;
        hl = new HigherLower();

        hl.setRandomNum(randomNum);
        hl.computeHigherLower();

        msg = hl.getMsg();

        JOptionPane.showMessageDialog(null, "Number: " + randomNum);
        JOptionPane.showMessageDialog(null, msg);
    }
}