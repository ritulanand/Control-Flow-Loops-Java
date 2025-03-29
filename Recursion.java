class Recursion {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallOutput = fact(n - 1); // 1
        System.out.println("small " + smallOutput);
        int output = n * smallOutput; // 1 * 1 2* 1 2* 3 6* 4 24 * 5
        System.out.println("ouyt " + output);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        // fact5 fact4 fact 3 fact 2 fcat 1 fact 0
    }
}

// fact(5) calls fact(4)
// fact(4) calls fact(3)
// fact(3) calls fact(2)
// fact(2) calls fact(1)
// fact(1) calls fact(0)
// fact(0) = 1

// fact(1) = 1 * fact(0) = 1 = 1*1 = 1

// fact(2) = 2 * fact(1) = 2*1 = 2

// fact(3) = 3 * fact(2) = 3 * 2 = 6

// fact(4) = 4 * fact(3) = 4*6 = 24

// fact(5) = 5 * 24 = 120