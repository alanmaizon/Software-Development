import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String input = sc.nextLine();

        LetterCounter lc=new LetterCounter();
        VowelCounter vc=new VowelCounter();
        SecondLetter sle=new SecondLetter();
        SpaceFinder sf=new SpaceFinder();
        VowelReplace vr=new VowelReplace();

        System.out.println("Total letters: "+lc.countLetters(input));
        System.out.println("Total vowels: "+vc.countVowels(input));
        System.out.println("Second letter of each word: "+sle.getSecondLetter(input));
        System.out.println("Space positions: "+sf.getSpacePositions(input));
        System.out.println("Vowels replaced: "+vr.replaceVowels(input));
    }
}