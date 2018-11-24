package Exe1_Search.Util;

public class SortUtil {

    public static void sort(double arr[], int start, int end)
    {
        if (start >= end) {
            return;
        } else {
            // Find the middle point
            int mid = (start + end) / 2;

            // Sort left
            sort(arr, start, mid);
            // Sort right
            sort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }

    private static void merge(double arr[], int start, int mid, int end)
    {
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]

        // Find sizes of two subarrays to be merged
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        /* Create temp arrays */
        double[] L = new double[leftSize];
        double[] R = new double[rightSize];

        /* Copy data to temp arrays */
        for (int i = 0; i < leftSize; ++i)
            L[i] = arr[start + i];
        for (int j = 0; j < rightSize; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int currentWalker = start;
        while (i < leftSize && j < rightSize)
        {
            if (L[i] <= R[j])
            {
                arr[currentWalker] = L[i];
                i++;
            }
            else
            {
                arr[currentWalker] = R[j];
                j++;
            }
            currentWalker++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftSize)
        {
            arr[currentWalker] = L[i];
            i++;
            currentWalker++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSize)
        {
            arr[currentWalker] = R[j];
            j++;
            currentWalker++;
        }
    }
}
