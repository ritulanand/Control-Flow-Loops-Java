import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] a = {1, 2, 3, 4, 5};
        int l = 0;
        int u = a.length - 1; // Corrected upper bound
        // int ele = 5;
        int ele =  sc.nextInt();

        while (l <= u) {
            int mid = (l + u) / 2; //2//3//4
            // System.out.print("mid"+" " +mid);

            if (a[mid] == ele) {
                System.out.println("Element found at index " + mid);
                return; // Exit the program after finding the element
            } else if (a[mid] < ele) {
                l = mid + 1; // 3 //4
                // System.out.print(l);
                // System.out.println("mid>"+mid);
            } else {
                u = mid - 1;
                // System.out.print(u);
                // System.out.println("mid<"+mid);
            }
        }

        System.out.println("Element not found"); 
    }
}