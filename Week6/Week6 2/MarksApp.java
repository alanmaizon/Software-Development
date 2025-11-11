import javax.swing.JOptionPane;
public class MarksApp {
    public static void main(String[] args) {
        
        Marks mk;
        mk=new Marks();

        int totalSub=Integer.parseInt(
            JOptionPane.showInputDialog("Enter number of subjects: ")
        );
        mk.setTotalSubjects(totalSub);

        for (int i=1; i<=totalSub; i++) {
            int mark=Integer.parseInt(
                JOptionPane.showInputDialog("Enter mark for subject "+i+" (0–100): ")
            );
            while (mark<0 || mark>100){
                mark=Integer.parseInt(
                JOptionPane.showInputDialog("Invalid mark. Enter again (0–100): ")
            );
            }
            mk.addMark(mark);
        }

        mk.computeMean();
        mk.computeGrade();

        JOptionPane.showMessageDialog(null,"Mean "+ mk.getMean());
        JOptionPane.showMessageDialog(null,"Grade: "+ mk.getGrade());

    }
}