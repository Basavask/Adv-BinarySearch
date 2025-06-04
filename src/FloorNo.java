import java.util.Scanner;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,13,15,16,19,21};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        // Floor of a No is The Greatest No of that is smaller or equal to given target.
        int floorNo = findFloorNo(arr, target);
        System.out.println("Floor of an given target: "+ target + "is: "+ floorNo);
    }

    static int findFloorNo(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
