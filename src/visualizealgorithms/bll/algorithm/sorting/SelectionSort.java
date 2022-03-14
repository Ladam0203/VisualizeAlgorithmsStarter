package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.AlgorithmLoader;
import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class SelectionSort extends GenericAlgorithm {
    public SelectionSort() {
        super("Selection Sort", "O(n^2)", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] arr = (int[]) super.getData();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
