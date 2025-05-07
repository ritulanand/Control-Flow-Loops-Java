import java.util.Arrays; 
 
 class UniqueElement {

    public static int findUnique(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i< arr.length -1;i+=2){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {89,2,3,3,4,4,2};
        // 2 2 3 3 4 4  78 89
        int res = findUnique(arr);
        System.out.println(res);

    }
}

//time complexity - O(nlogn + n) ~ O(nlogn)
