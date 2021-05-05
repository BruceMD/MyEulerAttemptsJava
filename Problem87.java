import java.util.ArrayList;

public class Problem87 {

    static void triplePowers(){

        ArrayList<Integer> primes = genPrimes();
        ArrayList<Integer> powers = new ArrayList<>();

//        System.out.println(primes);

        for (int a = 0; a < primes.size(); a++){
            for (int b = 0; b < primes.size(); b++){
                if (Math.pow(primes.get(a), 2) + Math.pow(primes.get(b), 3) > 50000000){
                    break;
                }
                for (int c = 0; c < primes.size(); c++){
                    int num = (int)(Math.pow(primes.get(a), 2) + Math.pow(primes.get(b), 3) + Math.pow(primes.get(c), 4));
                    if (num >= 50000000){
                        break;
                    }
                    if (!powers.contains(num)){
                        powers.add(num);
                    }

                }
            }
        }

        System.out.println(powers);
        System.out.println(powers.size());
    }

    static ArrayList<Integer> genPrimes(){
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < Math.pow(50000000, 0.5); i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    static boolean isPrime(int num) {
        if (num == 2){
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num) + 1; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
