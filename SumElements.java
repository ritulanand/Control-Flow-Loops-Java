import java.util.Scanner;

class SumElements {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int arr[] =  new int[5];
        for(int i=0; i< arr.length;i++){
            System.out.print("\n Enter the value at " + i+ " index  ");
            arr[i] = sc.nextInt();
        }
        int sum  = 0 ;
        for(int i: arr){
            sum = sum + i;
            
        }
        System.out.print(sum);
    }
}
