import java.util.Scanner;

class PushZero {
    public static void swap(int A[], int z, int nz){
        int temp = A[z];
        A[z] = A[nz];
        A[nz] = temp;
    }

    public static void pushZeros(int A[]){
        int nz= 0;
        int z =0;
        while(z< A.length){
            if(A[z] != 0){
                swap(A,z, nz);
                nz++;
            }
            z++;
        }

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the capacity of the array");
            int len = sc.nextInt();
            System.out.print("enter the value of "+ len + " elements in the array ");
            int A[] = new int[len];
            for(int i=0; i< len;i++){
                A[i] = sc.nextInt();
            }

            pushZeros(A);
            for(int i : A){
                System.out.print(i+ " ");
            }
    } 
}
