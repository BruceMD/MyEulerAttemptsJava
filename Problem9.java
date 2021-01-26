public class Problem9 {

    static void pythABC(){

        for (int c = 999; c > 333; c--) {
            for (int b = 1000 - c - 1; b > 332; b--) {
                int a = 1000 - c - b;

                if (a * a + b * b == c * c) {
                    System.out.println(c);
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(a*b*c);
                    return;
                }
            }
        }
    }
}
