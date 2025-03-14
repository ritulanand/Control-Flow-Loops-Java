import java.util.Scanner;

class Countsamll {
    public static int[] count(int n , int m, int []a, int[] b){
        int []ans = new int[n];
        for(int idx =0; idx< n;idx++){
            int low= 0, high = m-1, count = 0;
            while(low <= high){
                int mid = (low+ high) /2;
                if(b[mid] <= a[idx]){
                    System.out.print("less");
                    low = mid+ 1;
                    count = mid + 1;
                    
                }else{
                    System.out.print("not");
                    high = mid -1;
                }
            }
            System.out.println();
            ans[idx] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int A[] = {2, 4, 5, 6,8};
        int B[] = {7,8,9,10};
        int n = 5;
        int m = 4;
        int ans[] = count(n, m, A,B);
        for(int i:ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
