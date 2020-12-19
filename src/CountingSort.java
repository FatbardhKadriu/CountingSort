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

    public static int[] DistributionCountingSort(int[] myList, int upperBound, int lowerBound) {
        int[] D = new int[upperBound-lowerBound+1]; // initialize frequencies
        int[] S = new int[myList.length];
        for(int i = 0; i < myList.length; i++)
        {
            D[myList[i] - lowerBound] += 1; // compute frequenices
        }
        for(int j = 1; j < upperBound - lowerBound + 1; j++)
        {
            D[j] = D[j-1] + D[j]; // reuse for distribution
        }
        for(int k=myList.length-1; k > -1; k--)
        {
            int j = myList[k] - lowerBound;
            S[D[j] - 1] = myList[k];
            D[j] -= 1;
        }
        return S;
    }
}
