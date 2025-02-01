 class Methods2 {
    public static void printDetails(String name, String dob, long acc){
        System.out.println("Name : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("Account Number: "+acc);
        System.out.println("Balance "+ calculateBal(287624.23, 324344.45, 32232.9));
    }

    public static double calculateBal(double currentBal, double credit, double debit){
        return currentBal + credit - debit;
    }
    public static void main(String[] args) {
        // printDetails("John Doe", "12/08/1977", 979878979798789l);
        printDetails("Ritul Doe", "22/08/1979", 279878979798789l);
    }
}
