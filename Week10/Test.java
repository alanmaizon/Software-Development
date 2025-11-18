public class Test {
    public static void main(String[] args) {

        int[] nums = {5, 2, 10, 3};

        Main details = new Main();

        details.processArray(nums);

        System.out.println("Sum = " + details.getSum());
        System.out.println("Max = " + details.getMax());
    }
}