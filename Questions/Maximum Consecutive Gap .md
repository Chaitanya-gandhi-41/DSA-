# Question Link -> https://www.interviewbit.com/problems/maximum-consecutive-gap/

````Java
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if (A.length < 2)
            return 0;

        // Step 1: Find min and max elements in the array
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int num : A) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (minVal == maxVal)
            return 0;  // All elements are same

        // Step 2: Divide the range into buckets
        int bucketSize = Math.max(1, (maxVal - minVal) / (A.length - 1));

        // Step 3: Create buckets to store elements
        int numBuckets = (maxVal - minVal) / bucketSize + 1;
        int[][] buckets = new int[numBuckets][2]; // [minVal, maxVal]
        for (int i = 0; i < numBuckets; i++) {
            buckets[i][0] = Integer.MAX_VALUE;
            buckets[i][1] = Integer.MIN_VALUE;
        }

        // Step 4: Place each element into its bucket
        for (int num : A) {
            int index = (num - minVal) / bucketSize;
            buckets[index][0] = Math.min(buckets[index][0], num);
            buckets[index][1] = Math.max(buckets[index][1], num);
        }

        // Step 5: Iterate through buckets to find maximum difference
        int maxDiff = 0;
        int prevMax = minVal;
        for (int[] bucket : buckets) {
            if (bucket[0] != Integer.MAX_VALUE) {
                maxDiff = Math.max(maxDiff, bucket[0] - prevMax);
                prevMax = bucket[1];
            }
        }

        return maxDiff;
    }
}
````
