import java.util.Scanner;

class InsertionSort {


    public static  void sort(int A[]){
        for(int i=1; i< A.length; i++){
            int j= i-1 , temp = A[i];
            while(j>=0 && A[j] > temp){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {6,2,4, 7,5,1,3};
        sort(A);
        for(int i:A){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
