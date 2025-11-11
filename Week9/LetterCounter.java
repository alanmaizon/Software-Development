public class LetterCounter {
    public int countLetters(String str) {
        int count=0;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)) count++;
        }
        return count;
    }
}