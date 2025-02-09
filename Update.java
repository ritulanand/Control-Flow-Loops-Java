import java.util.Scanner;

class Update {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input    = sc.nextInt();
        return input;
        
    } 

    public static void update(int A[], int key, int newkey){
        for(int i=0;i<A.length;i++){
            if(A[i] == key){
                A[i] = newkey;
                return;
            }
        }
        System.out.println("key not found in array");
    }

    public static void main(String[] args) {
            int cap = takeInput("enter the capacity of the array");
            int A[] = new int[cap];
            for(int i=0;i<cap;i++){
                A[i] = takeInput("enter the element at"+ i+ " index");
            }
            int key = takeInput("enter key");
            int newkey = takeInput("enter the newkey");
            update(A, key, newkey);
            System.out.println("update array is ");
            for(int i:A){
                System.out.print(i+" ");
            }
    }
}
