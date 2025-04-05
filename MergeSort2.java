 class MergeSort2 {


    public static void merge(int a[], int l, int mid, int r){
        int len1 = l;
        int len2 = mid+1;
        int d[] = new int[r - l +1];
        int k = 0;
        while(len1 <= mid && len2 <= r){
            if(a[len1] <= a[len2]){
                d[k] = a[len1];
                len1++;
                k++;
            }else{
                d[k] = a[len2];
                len2++;
                k++;
            }
        }
        while(len1 <= mid){
            d[k] = a[len1];
                len1++;
                k++;
        }
        while(len2 <= r){
            d[k] = a[len2];
            len2++;
            k++;
        }

        for(int j=l, i = 0; i< d.length; i++, j++){
            a[j] = d[i];
        }
    }

    public static void mergeSort(int a[], int l, int r){
        if(l>=r){
            return;
        }
       int mid = (l+ r)/2;
        mergeSort(a, l, mid);
        mergeSort(a, mid+ 1, r);
        merge(a, l, mid, r);
    }

    public static void main(String[] args) {
        int a[] = {10,4,5,9,8,6,199,11,7};
        mergeSort(a, 0, a.length -1);
        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}
