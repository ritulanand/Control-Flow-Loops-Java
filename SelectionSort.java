import java.util.Scanner;

class SelectionSort {

    public static void  sort(int A[]){
        //outer pass loop
        for(int i=0; i< A.length -1 ;i++){
            int min = i;
            // inner loop for finding min value index
            for(int j= i+1; j< A.length; j++){
                if(A[j] < A[min]){
                    min =j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[]= {6,4,33,2};
        sort(A);
        for(int i: A){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
