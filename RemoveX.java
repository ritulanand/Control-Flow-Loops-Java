 class RemoveX {

    public static String removeX(String input){
        if(input.length() == 0){
            return "";
        }
        if(input.charAt(0) == 'x'){
            return removeX(input.substring(1));
        }else{
       return input.charAt(0) +   removeX(input.substring(1));
        }
    }


    public static void main(String[] args) {
        System.out.println(removeX("abcxdxex"));
    }
}
