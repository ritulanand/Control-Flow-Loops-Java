 class FirstFourEven {
    public static void main(String[] args) {
        int j=4;
        for(int i =1; i<=50 ;i++){
            if(i%2 == 0){
                if(j > 0){
                    System.out.println(i);
                    j--;
                }
            }
        }
    }
}
