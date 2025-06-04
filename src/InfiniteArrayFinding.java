
public class InfiniteArrayFinding {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int ans = findPositionInInfiniteArr(arr, 2);
        System.out.println(ans);
    }

    static int findPositionInInfiniteArr(int[] arr, int target) {
        int start = 0;
        int end = start + 1;

        int ans = -1;
        ans = check(start, end, target, arr);
        // infinite array looping approach... without using arr.length
        try {
            while (ans == -1){
                start = end + 1;
                end = end * 2;
                ans = check(start, end, target, arr);
            }
        } catch (Exception e) {
            return -1;
        }
        return ans;
    }

    static  int check(int start, int end, int target, int[] arr){
        while (start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
