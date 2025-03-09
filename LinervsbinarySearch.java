import java.util.Scanner;

class LinervsbinarySearch {

    public static int binarySearch(int A[], int n){
        int l =0, r = A.length -1;
        int steps = 0;
        while(l<=r){
            steps++;
            int mid = (l + r) / 2;
            if(A[mid] ==n){
                return mid;
            }else if(A[mid] < n){
                l = mid+ 1;
            }else{
                r = mid -1;
            }
        }
        System.out.println("number of steps in binary search "+ steps);
        return -1;
    }


    public static int linearSearch(int A[] , int n){
        int steps  =0;
        for(int i=0; i< A.length; i++){
            steps++;
            if(n == A[i]){
                return i;
            }
        }
        System.out.println("number of steps in linear search " +steps);

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array ");
        int len = sc.nextInt();
        int A[] = new int[len];
        int n = 10;

        int linear = linearSearch(A, n);
        System.out.println("linear "+ linear);
       
        int binary  =  binarySearch(A, n);
        System.out.println("binary " + binary);

        sc.close();
    }
}
