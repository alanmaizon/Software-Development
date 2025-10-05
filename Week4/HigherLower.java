public class HigherLower {
    private double randomNum;
    private String msg;

    public HigherLower(){
        randomNum=0;
        msg="";
    }

    public void setRandomNum(double randomNum){
        this.randomNum=randomNum;
    }

    public void computeHigherLower() {   // must match the call in the App
        if (randomNum >= 10) {
            msg = "higher";
        } else {
            msg = "lower";
        }
    }

    public String getMsg() {
        return msg;
    }
}