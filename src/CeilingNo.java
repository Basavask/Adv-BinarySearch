public class CeilingNo {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,9,11,14,16,17,18,19};
        int target = 15;
        // Ceiling of the number the smallest element which is greater than or equal to given target...
       int ceilingNo =  findCeilingNo(arr, target);
        System.out.println("Ceiling of the number "+ target + "is: "+ ceilingNo);
    }

    static int findCeilingNo(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
