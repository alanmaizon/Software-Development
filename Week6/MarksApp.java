import java.util.Scanner;

public class MarksApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Marks mk;
        mk=new Marks();

        System.out.print("Enter number of subjects: ");
        int totalSub=input.nextInt();
        mk.setTotalSubjects(totalSub);

        for (int i=1; i<=totalSub; i++) {
            System.out.print("Enter mark for subject "+i+" (0–100): ");
            int mark=input.nextInt();

            while (mark < 0 || mark > 100) {
                System.out.print("Invalid mark. Enter again (0–100): ");
                mark=input.nextInt();
            }

            mk.addMark(mark);
        }

        mk.computeMean();
        mk.computeGrade();

        System.out.printf("%nAverage Result: %.2f%n", mk.getMean());
        System.out.println("Grade: "+mk.getGrade());

        input.close();
    }
}