public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,5,3,1};
        int target = 1;
        int start = 0;

        int peakIndex = findPeakIndex(arr);
        int foundTarget = findTargetVal(start, peakIndex, arr, target, true);
        if(foundTarget >= 0){
            System.out.println(foundTarget);
        } else {
            System.out.println(findTargetVal(peakIndex+1, arr.length - 1, arr, target, false));
        }
    }



    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

        public static int findTargetVal(int start, int end, int[] arr, int target, boolean isAscending){
        while(start <= end){
            int mid = start + (end - start) / 2;
           if(isAscending){
               if(target < arr[mid]){
                   end = mid - 1;
               } else if(target > arr[mid]){
                   start = mid + 1;
               } else {
                   return mid;
               }
           } else {
               if(arr[mid] < target){
                   end = mid - 1;
               } else if( arr[mid] > target ){
                   start = mid + 1;
               } else {
                   return mid;
               }
           }
        }
        return -1;
    }

}




