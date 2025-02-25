import java.util.Scanner;

class Methods2darrays {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of rows");
        int rows = sc.nextInt();

        System.out.print("enter the no. of columns");
        int cols = sc.nextInt();
        int A[][] = new int[rows][cols];

        for(int i=0; i< rows;i++){
            for(int j=0;j< cols;j++){
                System.out.print("enter the eleemnt at A["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return A;
    }
    public static void printArray(int Arr[][]){
        // int n = Arr.length;
        // int m = Arr[0].length;
        
        // for(int i=0; i< n;i++){
        //     for(int j=0;j< m;j++){
        //         System.out.print(Arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i[]: Arr){
            for(int j: i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void largestCol(int Arr[][]){
        int n = Arr.length;
        int m = Arr[0].length;
        int largest = Integer.MIN_VALUE;

        for(int j=0; j< m; j++){
            int sum = 0;
            for(int i=0; i< n;i++){
                sum += Arr[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        System.out.print("sum of largest column "+ largest);
    }
    public static void main(String[] args) {

        int Arr[][] = takeInput();
        printArray(Arr);
        largestCol(Arr);
        
    }
}
