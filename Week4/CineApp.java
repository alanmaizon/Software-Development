import javax.swing.JOptionPane;
public class CineApp {
    public static void main(String[] args) {

        int countTickets;
        String ticket;
        int totalTickets;
        String age;
        int userAge;

        Cine cinema;
        cinema=new Cine();

        ticket=JOptionPane.showInputDialog("Number of tickets:");
        totalTickets=Integer.parseInt(ticket);

        cinema.setTotalTickets(totalTickets);

        countTickets=0;

        while(countTickets<cinema.getTotalTickets()){
            age=JOptionPane.showInputDialog("Each person's age:");
            userAge=Integer.parseInt(age);
            cinema.setUserAge(userAge);
            cinema.computeTicket();
            countTickets++;
        }
        
        JOptionPane.showMessageDialog(null,"Total: €"+cinema.getTotalCost());
    }
}
