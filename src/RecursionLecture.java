public class RecursionLecture {

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    // getPower using a for loop
    //public static long getPower(int base, int exponent) {
    //    long result = 1;
    //    for (int i = 1; i <= exponent; i++) {
    //        result = result * base;
    //    }
    //    return result;
    //}

//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        System.out.println("base: " + base);
        System.out.println("exponent: " + exponent);
        long count = base * getPower(base, exponent - 1);
        System.out.println("current count: " + count);
        return count;
    }

    public static void main(String[] args) {
        count(5);

        getPower(3, 5);
        // 3 * getPower(3, 4)
        // 3 * 3 * getPower(3, 3)
        // 3 * 3 * 3 * getPower(3, 2)
        // 3 * 3 * 3 * 3 * 3 <- final result
    }
}
