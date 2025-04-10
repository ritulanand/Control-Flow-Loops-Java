 class QuickSort {

    public static int partition(int a[], int si, int ei){
        int pivotElement = a[si];
        int smallerCount = 0;
        for(int i= si+ 1; i<= ei;i++){
            if(a[i] < pivotElement){
                smallerCount++;
            }
        }
        int temp = a[si+ smallerCount];
        a[si+ smallerCount] = pivotElement;
        a[si] = temp;
        int i = si;
        int j = ei;
        while(i<j){
            if(a[i] < pivotElement){
                i++;
            }else if(a[j] >= pivotElement){
                j--;
            }
            else{
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;

            }
        }
        return si + smallerCount;
    }

    public static void quickSort(int a[], int si, int ei){
        if(si>= ei){
            return;
        }
        int pivotIndex = partition(a, si, ei);
        quickSort(a, si, pivotIndex -1);
        quickSort(a, pivotIndex + 1, ei);
       
    }
    public static void main(String[] args) {
        int a[] = {10,4,5,53,5434,55,53,442,8,2};
        quickSort(a, 0, a.length -1);
        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}
