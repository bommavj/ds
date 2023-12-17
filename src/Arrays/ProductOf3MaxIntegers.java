package Arrays;

public class ProductOf3MaxIntegers {

    public static void main(String[] args) {
        //int arr[] = new int[]{-100,-98,-1,2,3,4};
        int arr[] = new int[]{-1,-2,-3};
        int mx = maximumProduct(arr);
        System.out.println(mx);
    }

    public static int maximumProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int runningProduct = 1;
        int pointer = 0;
        int window = 0;
        for(int i=window; i<nums.length; ){
            runningProduct *= nums[i];
            if(pointer == 2){
                maxProduct = Math.max(maxProduct, runningProduct);
                if(pointer == nums.length -1){
                    break;
                }
                pointer = 0;
                runningProduct = 1;
                i = ++window;
            }else{
                pointer++;
                i++;
            }
        }
        maxProduct = Math.max(maxProduct, runningProduct);
        return maxProduct;
    }


        /*public static int highestProductOf3(int[] arrayOfInts) {
            if (arrayOfInts.length < 3) {
                throw new IllegalArgumentException("Less than 3 items!");
            }

            // We're going to start at the 3rd item (at index 2)
            // so pre-populate highests and lowests based on the first 2 items.
            int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
            int lowest  = Math.min(arrayOfInts[0], arrayOfInts[1]);
            int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
            int lowestProductOf2  = arrayOfInts[0] * arrayOfInts[1];

            // Except this one--we pre-populate it for the first *3* items.
            // This means in our first pass it'll check against itself, which is fine.
            int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

            // Walk through items, starting at index 2
            for (int i = 2; i < arrayOfInts.length; i++) {
                int current = arrayOfInts[i];

                // Do we have a new highest product of 3?
                // It's either the current highest,
                // or the current times the highest product of two
                // or the current times the lowest product of two
                highestProductOf3 = Math.max(
                        highestProductOf3,
                        current * highestProductOf2,
                        current * lowestProductOf2);

                // Do we have a new highest product of two?
                highestProductOf2 = Math.max(
                        highestProductOf2,
                        current * highest,
                        current * lowest);

                // Do we have a new lowest product of two?
                lowestProductOf2 = Math.min(
                        lowestProductOf2,
                        current * highest,
                        current * lowest);

                // Do we have a new highest?
                highest = Math.max(highest, current);

                // Do we have a new lowest?
                lowest = Math.min(lowest, current);
            }

            return highestProductOf3;
        }*/

}
