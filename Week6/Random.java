public class Random {
    private int randomNum;
    private int userInput;
    private String str;

    public Random() {
        str = "";
    }

    public void newRandom() {
        int max = 10;
        int min = 1;
        int range = max-min+1;
        randomNum = (int)(Math.random() * range) + min;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public void computeRandom() {
        if (randomNum==userInput) {
            str="Winner";
        } else{
            str="Looser";
        }
    }

    public String getStr() {
        return str;
    }

    public int getRandom() {
        return randomNum;
    }
}