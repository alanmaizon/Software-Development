public class WageCalculator {

    double monthlyWage;
    double weeklyHours;
    double yearlyWage;
    double hourlyRate;

    public void setMonthlyWage(
        double monthlyWage) {
        this.monthlyWage = monthlyWage;
    }

    public void setWeeklyHours(
        double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public void computePushka() {
        yearlyWage = monthlyWage * 12;
        hourlyRate = yearlyWage / (weeklyHours * 52);
    }

    public double getYearlyWage() {
        return yearlyWage;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}