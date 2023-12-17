package Arrays;

public class SumOfAllSubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6};
        printAll(arr);
    }

    private static void printAll(int[] arr) {
        int totalSum = 0;
        for(int i=0;i<arr.length; i++){
            for(int j=i;j<arr.length; j++){
                int runingSum = 0;
                for(int k=i;k<=j; k++){
                    runingSum += arr[k];
                }
                totalSum += runingSum;
            }
        }
        System.out.println(totalSum);
    }
}
