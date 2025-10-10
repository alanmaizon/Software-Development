import java.util.Scanner;

public class Camino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to Camino - Pilgrim: The Ignatian Way\n");
        System.out.println("Spiritual Exercises - Mission One\n");

        System.out.println("You arrive at the base of a mountain, alone but full of hope. The path ahead is steep and unknown,");
        System.out.println("each day offers meditations and moments to choose how you respond to God’s call,");
        System.out.println("inviting you to grow in faith, gratitude, and love.\n");

        System.out.println("Your journey begins now. Take your time, reflect deeply, and let the path guide you.");
        System.out.println("\nDay 1: You got directions to the old monastery. The air is crisp, and you feel the weight of your journey ahead.");
        System.out.println("\nMeditation: Purpose of Life");
        System.out.println("\"For where your treasure is, there your heart will be also.\" - Matthew 6:21");
        System.out.print("\nDo you want to reflect on the purpose of your life? (yes/no): ");
        String input1 = scanner.nextLine();

        if (input1.equals("yes")) {
            System.out.println("\nDay 2: You find shelter and food at the local pub, allowing you to rest. The quiet moments invite reflection.");
            System.out.println("\nMeditation: God's Love");
            System.out.println("\"God so loved the world that he gave his only Son.\" - John 3:16");
            System.out.print("\nDo you want to open your heart to God's Love? (yes/no): ");
            String input2 = scanner.nextLine();

            if (input2.equals("yes")) {
                System.out.println("\nDay 3: You encounter challenges on the road. You reflect on your reactions and realize the need for mercy.");
                System.out.println("\nMeditation: Sin and Mercy");
                System.out.println("\"Be merciful, just as your Father is merciful.\" - Luke 6:36");
                System.out.print("\nDo you seek forgiveness for your sins? (yes/no): ");
                String input3 = scanner.nextLine();

                if (input3.equals("yes")) {
                    System.out.println("\nDay 4: The path is steep and demanding and you become very upset. You feel called to change your ways.");
                    System.out.println("\nMeditation: The Call to Conversion");
                    System.out.println("\"Repent, for the kingdom of heaven is near.\" - Matthew 4:17");
                    System.out.print("\nDo you choose to change and embrace conversion? (yes/no): ");
                    String input4 = scanner.nextLine();

                    if (input4.equals("yes")) {
                        System.out.println("\nDay 5: You arrive and receive a warm welcome. You get to share your journey and celebrate the gift of gratitude.");
                        System.out.println("\nMeditation: Gratitude");
                        System.out.println("\"Give thanks in all circumstances; for this is God’s will for you in Christ Jesus.\" - 1 Thessalonians 5:18");
                        System.out.print("\nDo you want to show more gratitude in your life? (yes/no): ");
                        String input5 = scanner.nextLine();

                        if (input5.equals("yes")) {
                            System.out.println("\nCongratulations! You cultivate a grateful heart this week. Peace be with you.\n");
                        } else {
                            System.out.println("\nTake a moment to reflect on gratitude. Every step counts, try again.\n");
                        }
                    } else {
                        System.out.println("\nChange is gradual. Reflect on what conversion could mean for you and try again.\n");
                    }
                } else {
                    System.out.println("\nFacing our imperfections is hard. Pause, breathe, and come back when you're ready.\n");
                }
            } else {
                System.out.println("\nOpening your heart takes courage. Take a quiet moment and attempt again later.\n");
            }
        } else {
            System.out.println("\nIt’s okay to start slowly. Whenever you’re ready, return and reflect on your purpose.\n");
        }
        scanner.close();
    }
}