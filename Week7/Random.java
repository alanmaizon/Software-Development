public class Random {
    private int randomNum;
    private int userInput;
    private String str;
    private int count;
    private int[] attempt;
    

    public Random() {
        str="";
        attempt=new int[3];
        count=0;

    }

    public void newRandom() {
        int max = 1;
        int min = 10;
        int range = max-min+1;
        randomNum = (int)(Math.random() * range) + min;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
        attempt[count]=userInput;
        count++;
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

    public int[] getAttempts() {
        return attempt;
    }

    public void reset(){
        count=0;
    }
}