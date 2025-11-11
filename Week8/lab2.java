import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int years=4;
        int total=5;
        double totalSum=0;

        for (int year=1; year<=years; year++) {
            double yearSum=0;
            System.out.println("Enter "+total+" results for year "+year+":");

            for (int i=1; i<=total; i++) {
                System.out.print("Result "+i+": ");
                double result=input.nextDouble();
                yearSum+=result;
            }

            double yearAvg=yearSum/total;
            System.out.println("Average for year "+year+" = "+yearAvg);
            totalSum+=yearSum;
        }

        double totalAvg=totalSum/(years*total);
        System.out.println("Total average = "+totalAvg);

        input.close();
    }
}