import java.util.Arrays;

public class FIrstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,5,5,7,7,7,7,7,7,7,8,8,8,9,9};
        int target = 22;

        int[] arr1 = {-1,-1};

        arr1[0] = findExponentialIndex(arr, target, true);
        arr1[1] = findExponentialIndex(arr, target,false);
        System.out.println(Arrays.toString(arr1));

    }

    static int findExponentialIndex(int [] arr, int target, boolean firstOccuranceSearch ){
        int start = 0;
        int end = arr.length -1 ;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if(firstOccuranceSearch){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
