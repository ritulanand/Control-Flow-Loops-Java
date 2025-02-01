 class ArrayTrverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,45,5,66,7,743,34,98,78};
        // System.out.println(arr.length);
        // for(int i=0; i<= arr.length -1;i++){
        //     System.out.print(arr[i] + " ");
        // }

        //foreach loop in java syntax
        // for(int i:arr){
        //     System.out.print(i+ " ");
            
        // }
        int min = arr[0];
		for(int i=0; i<= arr.length -1;i++){
            min = Math.min(min, arr[i]);
            System.out.print(min);
        }
    }
}
