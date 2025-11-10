package array;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 8, 9, 5, 6, 3};

        int max = findMax(numbers);
        System.out.println("Max: " + max);

        int sMax = findSecondMax(numbers);
        System.out.println("Second Max: " + sMax);

        int min = findMin(numbers);
        System.out.println("Min: " + min);

        int sMin = findSecondMin(numbers);
        System.out.println("Second Min: " + sMin);
    }

    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) max = numbers[i];
        }
        return max;
    }

    static int findSecondMax(int[] numbers) {
        int max = numbers[0];
        int sMax = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                sMax = max;
                max = numbers[i];
            } else if (numbers[i] > sMax && numbers[i] < max) {
                sMax = numbers[i];
            }
        }
        return sMax;
    }

    static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) min = numbers[i];
        }
        return min;
    }

    static int findSecondMin(int[] numbers) {
        int min = numbers[0];
        int sMin = Integer.MAX_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                sMin = min;
                min = numbers[i];
            } else if (numbers[i] < sMin && numbers[i] > min) {
                sMin = numbers[i];
            }
        }
        return sMin;
    }
}
