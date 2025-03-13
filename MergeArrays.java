import java.util.Scanner;

class MergeArrays {

    public static int[] merge(int A[], int B[]){
        int mergedArr[] = new int[A.length + B.length];
        int i = 0, j=0, k=0;
        while(i < A.length && j< B.length){
            if(A[i] < B[j]){
                mergedArr[k++] = A[i++];
            }else{
                mergedArr[k++] = B[j++];
            }
        }

        while( i< A.length){
            mergedArr[k++] = A[i++];
        }
        while(j < B.length){
            mergedArr[k++] = B[j++];
        }
        return mergedArr;
    }

    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 3, 5, 7, 9};
        int B[] = {2,4,6,8,10,12, 14};
        int C[] = merge(A,B);
        for(int i : C){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
