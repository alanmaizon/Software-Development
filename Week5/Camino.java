import java.util.Scanner;

public class Camino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to Camino - Pilgrim: The Ignatian Way\n");
        System.out.println("\nYour journey begins now...\n");
        // Meditation 1: Purpose of Life
        System.out.println("\nMeditation 1: Purpose of Life");
        System.out.println("\"For where your treasure is, there your heart will be also.\" - Matthew 6:21");
        System.out.print("Do you want to reflect on the purpose of your life? (yes/no): ");
        String input1 = scanner.nextLine().trim().toLowerCase();

        if (input1.equals("yes")) {

            // Meditation 2: God's Love
            System.out.println("\nMeditation 2: God's Love");
            System.out.println("\"God so loved the world that he gave his only Son.\" - John 3:16");
            System.out.print("Do you want to open your heart to God's Love? (yes/no): ");
            String input2 = scanner.nextLine().trim().toLowerCase();

            if (input2.equals("yes")) {

                // Meditation 3: Sin and Mercy
                System.out.println("\nMeditation 3: Sin and Mercy");
                System.out.println("\"Be merciful, just as your Father is merciful.\" - Luke 6:36");
                System.out.print("Do you seek forgiveness for your sins? (yes/no): ");
                String input3 = scanner.nextLine().trim().toLowerCase();

                if (input3.equals("yes")) {

                    // Meditation 4: The Call to Conversion
                    System.out.println("\nMeditation 4: The Call to Conversion");
                    System.out.println("\"Repent, for the kingdom of heaven is near.\" - Matthew 4:17");
                    System.out.print("Do you choose to change and embrace conversion? (yes/no): ");
                    String input4 = scanner.nextLine().trim().toLowerCase();

                    if (input4.equals("yes")) {

                        // Meditation 5: Gratitude
                        System.out.println("\nMeditation 5: Gratitude");
                        System.out.println("\"Give thanks in all circumstances; for this is God’s will for you in Christ Jesus.\" - 1 Thessalonians 5:18");
                        System.out.print("Do you want to embrace gratitude in your life? (yes/no): ");
                        String input5 = scanner.nextLine().trim().toLowerCase();

                        if (input5.equals("yes")) {
                            System.out.println("\nCongratulations! You cultivate a grateful heart. Peace be with you on your journey.\n");
                } else {
                    System.out.println("\nTake a moment to reflect on gratitude. Every step counts, try again.\n");
                }
            } else {
                System.out.println("\nChange is gradual. Reflect on what calling to conversion could mean for you and try again.\n");
            }
        } else {
            System.out.println("\nFacing our imperfections is hard. Pause, breathe, and come back to this meditation.\n");
        }
    } else {
        System.out.println("\nOpening your heart takes courage. Take a quiet moment and attempt this meditation again.\n");
    }
} else {
    System.out.println("\nIt’s okay to start slowly. Whenever you’re ready, return and reflect on your purpose.\n");
}

        scanner.close();
    }
}
