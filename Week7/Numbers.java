public class Numbers {
    //vars
    private int[] initialNumbers;
    private int[] finalNumbers=new int[3];
    
    //constructor
    public Numbers () {
    }
    // set
    public void setInitialNumbers (int[] initialNumbers) {
        this.initialNumbers=initialNumbers;
    }
    // compute
    public void computeFinalNumbers () {
        for (int i=0; i<initialNumbers.length;i++) {
            finalNumbers[i]=initialNumbers[i]*9;
        }
    }
    // get
    public int[] getFinalNumbers () {
    return finalNumbers;
    }
}