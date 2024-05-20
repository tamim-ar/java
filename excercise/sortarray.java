public class sortarray {
    public static void main(String[] args) {
        int[] array = { 2, 5, 3, 1, 4 };
        int[] array2 = { 2, 5, 3, 1, 4 };
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - 1; j++) {
                if (array2[j] > array2[j + 1]) {
                    temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array[i]);
        }
    }
}