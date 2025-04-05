 class BinarySearchusingrecusrion {

    public static int binarySearchusingrecursion( int a[], int si, int ei, int x){
        if(si> ei){
            return -1;
        }
        int midIndex = (si+ ei)/2;
        if(a[midIndex] == x){
            return midIndex;
        }else if(a[midIndex] < x){
            return binarySearchusingrecursion(a, midIndex + 1, ei, midIndex);
        }else{
            return binarySearchusingrecursion(a, si, midIndex -1, midIndex);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,34,44,8};
        System.out.println(binarySearchusingrecursion(a, 0, a.length -1, 38));
    }
}
