package Exe1_Search.Util;

public class BinarySearchUtil {

    public static void findNumber(double[] a, double key)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2; // do this to avoid overflow
            if (key < a[mid])
            {
                hi = mid - 1;
            }
            else if (key > a[mid])
            {

                lo = mid + 1;
            }
            else
            {
                System.out.println("Find target: " + key);
                return;
            }
        }
        System.out.print("Did not find target: " + key);
    }
}
