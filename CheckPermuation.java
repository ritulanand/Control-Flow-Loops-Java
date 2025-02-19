import java.util.Scanner;

class CheckPermuation {

    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		
			int[] count = new int[26];
			for(int i=0; i< str1.length();i++){
                System.out.println("i"+ (str1.charAt(i)- 'a'));
				count[str1.charAt(i)- 'a'] += 1;
			}
				for(int i=0; i< str2.length();i++){
				count[str2.charAt(i) - 'a'] -= 1;
			}
			boolean isPermutation = true;
			for(int i=0; i< 26;i++){
				if(count[i] != 0){
					isPermutation = false;
				}
			}
			return isPermutation;
	}

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
        boolean ans = isPermutation(str1, str2);
        System.out.println(ans);
    }
}
