public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {5, 1, 6, 3, 4};

        // Bubble sort logic
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the elements
                    int temp1 = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp1;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + ",");
        }
    }
}
