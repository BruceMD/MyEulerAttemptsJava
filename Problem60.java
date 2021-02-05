import java.util.ArrayList;

public class Problem60 {

    static void concatenatePrimes(){

        ArrayList<Integer> primes = genPrimeList();

        System.out.println(primes);

        int i = 0;

        while ( i < primes.size() - 4){
            int j = i+1;
            while(j < primes.size() - 3){
                if (concatenate(primes.get(i), primes.get(j))){
                    int k = j+1;
                    while (k < primes.size() - 2){
                        if (concatenate(primes.get(i), primes.get(k)) && concatenate(primes.get(j), primes.get(k))){
                            int l = k+1;
                            while(l < primes.size() - 1){
                                if (concatenate(primes.get(i), primes.get(l)) && concatenate(primes.get(j), primes.get(l)) && concatenate(primes.get(k), primes.get(l))){
                                    int m = l+1;
                                    while(m < primes.size()){
                                        if (concatenate(primes.get(i), primes.get(m)) && concatenate(primes.get(j), primes.get(m)) && concatenate(primes.get(k), primes.get(m)) && concatenate(primes.get(l), primes.get(m))){
                                            System.out.println(primes.get(i) + " " + primes.get(j) + " " + primes.get(k) + " " + primes.get(l) + " " + primes.get(m));
                                            System.out.println(primes.get(i) + primes.get(j) + primes.get(k) + primes.get(l) + primes.get(m));
                                            return;
                                        }
                                        m++;
                                    }
                                }
                                l++;
                            }
                        }
                        k++;
                    }
                }
                j++;
            }
            i++;
        }
    }

    static boolean concatenate(int x, int y){

        double forward = Double.valueOf(String.valueOf(x) + String.valueOf(y));
        double reverse = Double.valueOf(String.valueOf(y) + String.valueOf(x));

        return isPrime(forward) && isPrime(reverse);

    }

    static ArrayList<Integer> genPrimeList(){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < 10000; i++){
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }

    static boolean isPrime(double num) {
        if (num % 2 == 0){
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
