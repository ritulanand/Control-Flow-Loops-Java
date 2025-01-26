import java.util.Scanner;

class MirrorImagePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
            int k = i;
            for(int j=1;j<=i;j++){
				System.out.print(k);
                k++;
			}
            k =k-2;
            // k= 2*i-2;
            for(int j=1;j<=i-1;j++){
				System.out.print(k);
                k--;
			}
			System.out.println();
		}
    }
}

//psedo code
// START
//     INPUT n
//     i = 1
//     WHILE i <= n
//         spaces = 1
//         WHILE spaces <= n - i
//             PRINT " "  // Printing leading spaces
//             spaces = spaces + 1
//         END WHILE

//         k = i
//         j = 1
//         WHILE j <= i
//             PRINT k  // Printing increasing sequence
//             k = k + 1
//             j = j + 1
//         END WHILE

//         k = k - 2
//         l = 1
//         WHILE l <= i - 1
//             PRINT k  // Printing decreasing sequence
//             k = k - 1
//             l = l + 1
//         END WHILE

//         PRINT newline  // Go to next line
//         i = i + 1
//     END WHILE
// END
