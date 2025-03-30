 class CheckArrayisSorted {

    public static boolean isSorted(int a[], int startindex){
        if(startindex == a.length -1){
            return true;
        }
        if(a[startindex] > a[startindex + 1]){
            return false;
        }
        boolean isSmallArraySorted = isSorted(a, startindex + 1);
        return isSmallArraySorted;

    }
    public static void main(String[] args) {
        int a[] = {1,3,45,6};
        System.out.println(isSorted(a, 0));
    }
}
