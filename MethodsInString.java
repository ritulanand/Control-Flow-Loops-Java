 class MethodsInString {
    public static void main(String[] args) {
        String str = "coding is good";

        // Methods in string 
        //length()
        System.out.println(str.length());
        //charAt()
        //toLowerCase(), toUpperCase()
        // trim() // before or after troaling spaces removed
        System.out.println(str.substring(7, 9)); // endindex exclusive
        //substring()
        //replace()
        System.out.println(str.replace('o', '@'));
        String s1 = "Hello"; //    H -> 2
        String s2 = "Hello"; // h ->34
        //compareTo
        System.out.println(s1.compareTo(s2)); //  34-2
        // if value is postive s2 is greater in ascii value than s1
        // if value is negative s2 is smaller in asci value than s1
        //return 0 if equal


    }
}
