public class Cine {
    private int totalTickets;
    private int userAge;
    private int totalCost;

    public Cine(){
        totalTickets=0;
        totalCost=0;
    }

    public void setTotalTickets(int totalTickets){
        this.totalTickets=totalTickets;
    }

    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public void computeTicket(){
        if (userAge>=18){
            totalCost+=15;
        }else{
            totalCost+=10;
        }
    }

    public int getTotalTickets(){
        return totalTickets;
    }

    public int getTotalCost(){
        return totalCost;
    }
}