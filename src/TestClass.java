import java.util.Random;

public class TestClass {

    public static void main(String[] args) {

        // int[] myList = { 13, 6, 9, 3, 10, 7 };
        Random rnd = new Random();

        int[] myList = new int[100000];
        for (int i = 0; i < 100000; i++) {
            myList[i] = rnd.nextInt(100000);
        }

        long startTime = System.nanoTime();

        myList = CountingSort.ComparisonCountingSort(myList);

        long elapsedTime = System.nanoTime() - startTime;

        // Print array
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        System.out.println("\n\nElapsed time s: " + elapsedTime / 1000000000); // ns/n = s
    }
}
