 class SecondLargest {
    public static void main(String[] args) {
        int a[] = {12, 43, 9, 56, 74,10,3,18};
        int max1 = a[0];
        int max2 = max1;
        for(int i=1; i< a.length;i++){
            if(a[i] > max1){
                max2 =max1;
                max1 = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.print("second largest element is "+ max2);
    }
}
