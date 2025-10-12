public class PresetArray {
    public static void main(String[] args) {
        int[] preset;
        int big = 0;
        preset = new int[5];
        preset[0] = 1;
        preset[1] = 4;
        preset[2] = 20;
        preset[3] = 200;
        preset[4] = 4000;
        for (int i = 1; i < preset.length; i++) {
            if (preset[i] > big) {
                big = preset[i];
            }
        }   
        System.out.println(big);
    }
}
