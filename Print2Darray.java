 class Print2Darray {
   public static void main(String[] args) {
    int A[][] = new int[3][4];
    int B[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {9,0,0}};
    System.out.println(B.length);
    System.out.println(B[0].length);
    for(int i=0; i<B.length; i++){
        for(int j=0; j< B[0].length;j++){
            System.out.print(B[i][j]+ " ");
        }
        System.out.println();
    }
   } 
}
