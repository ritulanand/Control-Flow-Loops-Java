import java.util.Arrays;
import java.util.Scanner;

class ArrayIntersection {

    public static void intersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                j++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Intersection of two arrays:");
        intersection(arr1, arr2);
    }
}


// Time complexity: O(nlogn + mlogm + O(n, m))
// Space complexity: O(1)