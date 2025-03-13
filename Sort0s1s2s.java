import java.util.Scanner;

class Sort0s1s2s {

    public static void sort012(int[] arr){
    	
        int i =0;
        int nz = 0;
        int nt = arr.length -1;
        while(i<=nt){
        if(arr[i] == 0){
            int temp = arr[i];
            arr[i] = arr[nz];
            arr[nz]=temp;
            i++;
            nz++;
        }
        else if(arr[i] == 2){                
           int temp = arr[i];
            arr[i] = arr[nt];
            arr[nt]=temp;
            nt--;   
        }
        else {
            i++;
        }             
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {0,1,2, 0,2,0,1};
        sort012(A);
        for(int i:A){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
