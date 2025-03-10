import java.util.Scanner;

class Bubblesort {

    public static void sort(int A[]){
        for(int i=0; i< A.length -1; i++){
            for(int j=0; j< A.length -1 -i; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {6,5,4,3,2,1};
        sort(A);
        for(int i: A){
            System.out.print(i + " ");
        }
    }
}
