import java.util.*;

class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day");
        int day = sc.nextInt();
        // if(day ==1) {
        //     System.out.println("Monday");
        // }else if(day == 2){
        //     System.out.println("Tuesday");
        // }else if(day ==3){
        //     System.out.println("Wednesday");
        // }else if(day == 4){
        //     System.out.println("Thrusday");
        // }else if(day ==5){
        //     System.out.println("Friday");
        // }else if(day ==6){
        //     System.out.println("Saturday");
        // }else if(day ==7){
        //     System.out.println("Sunday");
        // }else {
        //     System.out.println("please enter valid day");
        // }

        switch(day){
            case 1 : System.out.println("Monday");
              break;
            case 2 : System.out.println("Tuesday");
             break;
             case 3: System.out.println("Wed");
             break;
             case 4: System.out.println("Thris");
             break;
             case 5: System.out.println("Fru");
             break;
             case 6 : System.out.println("Sat");
             break;
             case 7: System.out.println("Sunday");
             break;
             default : 
              System.out.println("please enter valid");

        }
        sc.close();
    }
}
