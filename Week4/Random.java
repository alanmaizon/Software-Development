public class Random {
    private int randomNum;
    private int userInput;
    private String str;

    public Random(){
        int max=10;
        int min=1;
        int range=max-min+1;
        userInput=0;
        str="";
        randomNum=(int)(Math.random() * range) + min;
    }

    public void setRandomNum(int randomNum){
        this.randomNum=randomNum;
    }

    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    public void computeRandom(){
        if (randomNum==userInput){
            str="Winner";
        } else{
            str="Looser";
        }
    }

    public String getStr(){
        return str;
    }

    public int getRandom(){
        return randomNum;
    }
    
}
