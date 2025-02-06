import java.util.Scanner;

class InsertElement {

    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
    


    public static int insert(int A[], int pos, int ele, int size, int cap){
        
        if(pos > size || pos < 0){
            System.out.println("Invalid position");
            return size;
        }
        if(size >= cap){
            System.out.println("Array is full");
            return size;
        }

       
        if(pos == size){
            A[pos] = ele;
            size++;
            return size;
        }
        // System.out.println("hi");
        for(int i= size;i> pos;i--){
            A[i] = A[i-1];
        }
       
            A[pos] = ele;
            size++;
            return size;  
        
        
        
        
             
    }
    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of array: ");
        int size = takeInput("Enter the size");
        if(size > cap){
            System.out.println("Invalid size");
            return;
        }
       
        int A[] = new int[cap];
        for(int i=0;i<size;i++){
            A[i] = takeInput("Enter the element at "+i+"index");
        }
        int ele = takeInput("Enter the element to be inserted");
        int pos = takeInput("Enter the position");
        size =  insert(A, pos, ele, size, cap);  
        System.out.println("size "+ size);
        for( int i: A){
            System.out.print(i+" ");
        }
    }
}
