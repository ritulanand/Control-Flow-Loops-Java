import java.util.Scanner;

class PlaywithPattern {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      int rows = 2*n -1; // n=3 rows =5
      for(int i=0; i< rows;i++){
        //i=1
        for(int j=0;j<rows;j++){
            //j=0
            if(j== i || j == rows-i-1){
              
                if(i+1 < rows -i){
                    // 1<5
                    System.out.print(i+1);
                }else{
                    System.out.print(rows -i);
                }
                
            }else{
                //123
                System.out.print(" ");
            }
        }
        System.out.println();
      }
      sc.close();


       
    }
}
