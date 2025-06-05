import java.util.Arrays;

public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
       int index = peakIndexInMountainArray(arr);
        System.out.println("Index..."+index);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
//            this is harmul code
//            if(mid == 0){
//                mid = 1;
//            }
//            this logic is changed.....
//            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
//                return mid;
//            } else if(arr[mid] < arr[mid+1]){
//                start = mid + 1;
//            } else if(arr[mid] < arr[mid - 1]){
//                end = mid - 1;
//            }
        }
        // this is invalid because it should never reach...(-1);
//        return -1;
        return start;
    }
}
