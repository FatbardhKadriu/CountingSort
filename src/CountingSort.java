public class CountingSort {

    public static int[] ComparisonCountingSort(int[] myList) {
        int n = myList.length;
        int[] Count = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (myList[i] < myList[j]) {
                    Count[j] += 1;
                } else {
                    Count[i] += 1;
                }
            }
        }
        int[] S = new int[n];
        for (int k = 0; k < n; k++) {
            S[Count[k]] = myList[k];
        }
        return S;
    }
}
