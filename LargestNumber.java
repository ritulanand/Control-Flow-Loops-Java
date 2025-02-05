 class LargestNumber {
    public static void main(String[] args) {
        int A[] = {12, 43,9,56,74,10,3,18};
        int max = Integer.MIN_VALUE;
        for(int i=0; i< A.length; i++){
            if(A[i] > max){
                max = A[i];
            }

        }
        System.out.print("Max "+max);
    }
}
