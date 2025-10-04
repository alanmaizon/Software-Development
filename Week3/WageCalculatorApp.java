import javax.swing.JOptionPane;
public class WageCalculatorApp{
    public static void main(String[] args){

        double monthlyWage=0;
        double weeklyHours=0;

        WageCalculator pushka;
        pushka=new WageCalculator();
        
        while(monthlyWage<=0){
            monthlyWage=Double.parseDouble (JOptionPane.showInputDialog (null,"How much do you earn by month?"));
            if(monthlyWage<=0){JOptionPane.showMessageDialog(null,"Input a valid number");}
        }
        while (weeklyHours<=0){
            weeklyHours=Double.parseDouble (JOptionPane.showInputDialog (null,"How many hours a week do you work?"));
            if(weeklyHours<=0){JOptionPane.showMessageDialog(null,"Input a valid number");}
        }

        pushka.setMonthlyWage(monthlyWage);
        pushka.setWeeklyHours(weeklyHours);

        pushka.computePushka();

        JOptionPane.showMessageDialog(null,"Your income per year is: € "+pushka.getYearlyWage());
        JOptionPane.showMessageDialog(null,"You rate is € "+pushka.getHourlyRate()+" per hour");
    }
}