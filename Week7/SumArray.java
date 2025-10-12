public class SumArray {
    public static void main(String[] args) {
        int[] preset;
        int sum = 0;
        double mean;
        
        
        preset = new int[5];
        preset[0] = 1;
        preset[1] = 4;
        preset[2] = 20;
        preset[3] = 200;
        preset[4] = 4000;

        for (int i = 0; i < preset.length; i++) {
            sum += preset[i];
        }

        mean = (double) sum / preset.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The mean is: " + mean);
    }
}
