import java.util.Scanner;


public class DescendingOrder {


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void selectionSortDescendTrace(int[] data, int length) {
        int maxInd;
        for (int i = 0; i < length - 1; ++i) {
            maxInd = i;
            for (int j = i; j < length; ++j) {
                if (data[j] > data[maxInd]) {
                    maxInd = j;
                }
            }
            swap(data, i, maxInd);
            for (int j = 0; j < length; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[10];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextInt();
            if (data[i] == -1)
                break;
            ++count;
        }
        selectionSortDescendTrace(data, count);
    }
}

