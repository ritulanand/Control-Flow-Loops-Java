 class StrvsStrBuf {
    public static void main(String[] args) {
        String str = "Java";
        System.out.print(str+ " ");
        System.out.println(System.identityHashCode(str)); // 1450495309
        str = str + "program";
        System.out.print(str+ ' ');
        System.out.println(System.identityHashCode(str)); // 1670782018
        System.out.println();

        StringBuffer sb = new StringBuffer("Hello"); // expandable
        System.out.print(sb+ " ");
        System.out.println(System.identityHashCode(sb)); 
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        sb.append("World");
        System.out.print(sb + "  ");
        System.out.println(System.identityHashCode(sb)); 

    }
}
