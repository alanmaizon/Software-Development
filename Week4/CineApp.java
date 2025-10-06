import javax.swing.JOptionPane;
public class CineApp {
    public static void main(String[] args) {

        int countTickets;
        int totalTickets;
        int userAge;

        Cine cinema;
        cinema=new Cine();

        totalTickets=Integer.parseInt (JOptionPane.showInputDialog("Number of tickets:"));
        cinema.setTotalTickets(totalTickets);

        countTickets=0;

        while(countTickets<cinema.getTotalTickets()){
            userAge=Integer.parseInt (JOptionPane.showInputDialog("Each person's age:"));
            cinema.setUserAge(userAge);
            cinema.computeTicket();
            countTickets++;
        }
        
        JOptionPane.showMessageDialog(null,"Total: €"+cinema.getTotalCost());
    }
}
