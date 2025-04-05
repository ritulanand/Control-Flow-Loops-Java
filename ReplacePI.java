public class ReplacePI {

    public static String replacePi(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            // call recusrion on string of length n-2
            String smalloutput = replacePi(s.substring(2));
            return "3.14" + smalloutput;
        }else{
            //call recusrion on  string of length n-1
            String smalloutput = replacePi(s.substring(1));
            return s.charAt(0) + smalloutput;
        }
    }
        public static void main(String[] args) {
            System.out.println(replacePi("apiapipipiip"));
        }
}
