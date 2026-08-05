public class LargestArray {

    public static void main(String[] args) {

        int[] numbers = {15, 18, 25, 10, 30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}