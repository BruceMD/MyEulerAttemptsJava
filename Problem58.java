public class Problem58 {

    static void spiralPrimes(){

        double n = 2;
        double total = 1;
        double primeCount = 0;

        int ref = 1;

        while (true){
            for (int i = 0; i < 4; i++){
                ref += n;
                if (isPrime(ref)){
                    primeCount++;
                }
                total++;
            }
            if (primeCount / total < 0.1d){
                System.out.println("Answer: " + (int)n+1);
                break;
            }
            n = n+2;
        }

    }

    static boolean isPrime(int num) {

        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
