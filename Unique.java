import java.util.Scanner;

class Unique {

    public static int findUnique(int[] arr){
		//Your code goes here

    for(int i=0; i< arr.length;i++){
      int j=0;
      while(j< arr.length){
        if(i!= j && arr[i] == arr[j]){
          break;
        }
        j++;
      }
      System.out.print("hi iiii   ");
        if(j== arr.length){
        return arr[i];
      }
    
    }
    System.out.print("out");
    return -1;
    
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println( findUnique(arr));
    }
}
