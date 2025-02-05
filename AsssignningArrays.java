 class AsssignningArrays {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1;
        num2++;
        System.out.println(num1); // 10
        System.out.println(num2); // 11

        int A[] = {1,2,3,4,5};
        int B[] = A;
        System.out.println(A);
        System.out.println(B);
        int c[] = new int[5];
    System.out.println(c);
        B[3] = 899;
        for(int i:A){
            System.out.println(i+ " ");  // 1 2 3 899 5
        }
        for(int i:B){
            System.out.println(i+ " "); // 1 2 3 899 5
        }

    }
}
