import java.util.Random;

public class TestClass {

    public static void main(String[] args) {

            int[] myList = new int[100000];
            Random rnd = new Random();

            for (int i = 0; i < 100000; i++) {
                myList[i] = rnd.nextInt(100000);
            }

            long startTime_1 = System.nanoTime();

            int[] list_1 = CountingSort.ComparisonCountingSort(myList);

            long elapsedTime_1 = System.nanoTime() - startTime_1;
            System.out.println("\nExecution time of comparison counting sort: " + elapsedTime_1 / 1000000 + "ms"); // ns/u = ms

//            Print list 1
//            for (int i = 0; i < list_1.length; i++) {
//                System.out.print(list_1[i] + " ");
//            }

            int max = myList[0], min = myList[0];
            for(int i = 1; i < myList.length; i++)
            {
                if(myList[i] > max)
                    max = myList[i];
                if(myList[i] < min)
                    min = myList[i];
            }
            long startTime_2 = System.nanoTime();

            myList = CountingSort.DistributionCountingSort(myList, max, min);

            long elapsedTime_2 = System.nanoTime() - startTime_2;
            System.out.println("Execution time of distribution counting sort: " + elapsedTime_2 / 1000000 + "ms"); // ns/u = ms

//            Print list 2
//            for(int i = 0; i < myList.length; i++)
//            {
//                System.out.print(myList[i] + " ");
//            }
    }
}
