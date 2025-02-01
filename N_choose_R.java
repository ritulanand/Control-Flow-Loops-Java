import java.util.Scanner;

class N_choose_R {

    public static int facto(int num){
        int fact =1;
        for(int i =num; i>0 ;i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(facto(n));
        int r = sc.nextInt();
        sc.close();

        if(n<0 || r<0){
            System.out.println("not a valid number");
            return;
        }
        int factN = facto(n);
        int factR = facto(r);
        int factNR = facto(n-r);
        int ncr = factN/(factR* factNR);
        System.out.println(ncr);
        

    }
}
