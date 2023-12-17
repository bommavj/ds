package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = new int[]{7 ,5, 2, 11, 6 ,43, 0, 1};
        int secondLar = findSecondLargest(arr);
        System.out.println(secondLar);

    }

    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > largest){
                secondLargest = largest;
                largest = n;
            }else{
                if(n > secondLargest)
                    secondLargest = n;
            }
        }
        return secondLargest;
    }
}
