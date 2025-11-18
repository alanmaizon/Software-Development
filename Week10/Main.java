public class Main {

    private int sum;
    private int max;
    public Main() {
        sum=0;
        max=0;
    }

    public void processArray(int[] numbers) {
        sum=0;
        max=numbers[0];

        for (int num : numbers) {
            sum+=num;
            if (num>max) {
                max=num;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public int getSum() {
        return sum;
    }
}