package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 4};
        int k = 3;
        int val = findKthLargestElement(arr, k);
        System.out.println(val);

        int val2 = findKthLargest(arr, k);
        System.out.println(val2);
    }

    private static int findKthLargestElement(int[] arr, int k) {

        Integer ar[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(ar, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);

        for (int i = 0; i < k; i++)
            list.add(ar[i]);

        int kthLargestEle = list.get(k-1);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int a : arr){
            minHeap.add(a);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, (a, b) -> b - a);
        // Add the first k elements to the heap
        for (int i = 0; i < k; i++) {
            heap.add(nums[i]);
        }
        // Add the remaining elements to the heap
        // and remove the largest element if the heap
        // size exceeds k
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > heap.peek()) {
                heap.poll();
                heap.add(nums[i]);
            }
        }
        // The root of the heap is the kth largest element
        return heap.peek();
    }
}
