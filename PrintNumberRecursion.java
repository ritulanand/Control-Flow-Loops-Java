public class PrintNumberRecursion {

    public static void print(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println("before " + n);
        print(n-1);
        System.out.println("out " + n);
        
    }

    public static void main(String[] args) {
    print(5);
    }
}
