public class TestArrayDetails {
    public static void main(String[] args) {

        int[] nums = {5, 2, 10, 3};

        ArrayDetails details = new ArrayDetails();

        details.processArray(nums);

        System.out.println("Sum = " + details.getSum());
        System.out.println("Max = " + details.getMax());
    }
}