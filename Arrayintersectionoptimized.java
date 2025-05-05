import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayintersectionoptimized {

    public static boolean binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static List<Integer> intersectionWithBinarySearch(int[] arr1, int[] arr2) {
        // Sort the smaller array
        if (arr1.length > arr2.length) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }

        Arrays.sort(arr2);
        List<Integer> intersection = new ArrayList<>();

        // Perform binary search for each element in the larger array
        for (int element : arr2) {
            if (binarySearch(arr1, element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        List<Integer> result = intersectionWithBinarySearch(arr1, arr2);
        System.out.println(result);  // Output: [2, 5]
    }
}