 class CheckNumberRecursive {



    public static boolean checknumberinarray(int a[], int n , int x){
        if(n == 0){
            return false;
        }
        if(a[a.length - n] == x){
            return true;
        }
        return checknumberinarray(a, n-1, x);
    }

public static boolean checkNumber(int a[], int x){
    int n = a.length;
   return checknumberinarray(a, n, x);
}

    public static void main(String[] args) {
        int a[] = {};
        int target = 4;
        System.out.println(checkNumber(a, target ));
    }
}
