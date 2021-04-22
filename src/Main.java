public class Main {

    public static void main(String[] args) {
        int[] array = {9, 6, 8, 1, 2, -4, 6, 10, 15};
        System.out.println("Mang truoc khi sap xep:");
        showResult(array);
        bubbleSort(array);
        System.out.println("Mang sau khi sap xep noi bot:");
        showResult(array);
        System.out.println("Mang sau khi sap xep chon:");
        selectionSort(array);
        showResult(array);
        System.out.println("Mang sau khi sap xep chen:");
        insertionSort(array);
        showResult(array);
    }

    private static void showResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int position = i;
            int temp = array[position];
            while (position > 0 && array[position - 1] > temp) {
                array[position] = array[position -1];
                position--;
            }
            array[position] = temp;
        }
    }
}
