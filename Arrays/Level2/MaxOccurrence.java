package Arrays.Level2;

public class MaxOccurrence {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 2, 1};

        int maxCount = 0;
        int maxElement = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }

        }

        System.out.println("Maximum Occurring Element: " + maxElement);
        System.out.println("Count: " + maxCount);
    }
}