 class String2 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        System.out.println(s1);

        // using new keyword
        //1 passing String literal
        String str = new String("Coding");
        // 2. passing chacater array
        char ch[] = {'n', 'i', 'n', 'j', 'a'};
        String str2 = new String(ch);
        
        //3 passing byte array
        byte b[] = {97,98,99,100,101};
        String str3 = new String(b);


        System.out.println("str1  "+str);
        System.out.println("str1  "+str2);
        System.out.println("str1  "+str3);

    }
}
