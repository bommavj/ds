package ArraysStrings;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int h [] = new int[] {1,8,6,2,5,4,8,3,7};
        int i = maxArea(h);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * h);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
