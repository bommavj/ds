package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        /*int[] ar = new int[]{1, 4, 20, 3, 10, 5};
        int target = 33;*/
        int[] nums = {1, 2, 3};
        int k = 3;
        int i = subarraySum(nums, k);
        System.out.println(i);

        int j = subarraySum2(nums, k);
        System.out.println(j);
    }

    public static int subarraySum2(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int p = 0;
        for(int n : nums){
            sum += n;
            if(sum == k){
                count++;
            }while(sum > k){
                sum -= nums[p];
                if(sum == k)
                    count++;
                p++;

            }
        }
        return count;
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        // Map to store cumulative sums and their frequencies
        Map<Integer, Integer> cumulativeSumFreq = new HashMap<>();
        cumulativeSumFreq.put(0, 1); // Initialize with cumulative sum 0 having frequency 1

        for (int num : nums) {
            sum += num; // Update the current cumulative sum

            // If there exists a cumulative sum such that cumulativeSum - k = previousCumulativeSum,
            // it means the sum of elements between previousCumulativeSum and current position equals k
            if (cumulativeSumFreq.containsKey(sum - k)) {
                count += cumulativeSumFreq.get(sum - k);
            }

            // Update the frequency of the current cumulative sum
            cumulativeSumFreq.put(sum, cumulativeSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
