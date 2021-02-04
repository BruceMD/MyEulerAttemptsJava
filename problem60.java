import java.util.ArrayList;

public class Problem60 {

    static void concatenatePrimes(){

        ArrayList<Integer> primes = genPrimeList();

        System.out.println(primes);

        for (int i = 0; i < primes.size()-5; i++){
            for (int j = i+1; j < primes.size()-4; j++){
                if (!concatenate(primes.get(i), primes.get(j))){
                    break;
                }
                for (int k = j+1; k < primes.size()-3; k++){
                    if (!concatenate(primes.get(i), primes.get(k))){
                        break;
                    }
                    else if (!concatenate(primes.get(j), primes.get(k))){
                        break;
                    }
                    for (int l = k+1; l < primes.size(); l++){
                        if (!concatenate(primes.get(i), primes.get(l))){
                            break;
                        }
                        else if (!concatenate(primes.get(j), primes.get(l))){
                            break;
                        }
                        else if (!concatenate(primes.get(k), primes.get(l))){
                            break;
                        }
                        for (int m = l+1; m < primes.size(); m++){
                            if (!concatenate(primes.get(i), primes.get(m))){
                                break;
                            }
                            else if (!concatenate(primes.get(j), primes.get(m))){
                                break;
                            }
                            else if (!concatenate(primes.get(k), primes.get(m))){
                                break;
                            }
                            else if (!concatenate(primes.get(l), primes.get(m))){
                                break;
                            }
                            System.out.println(primes.get(i) + " " + primes.get(j) + " " + primes.get(k) + " " + primes.get(l) + " " + primes.get(m));
                        }
                    }
                }
            }
        }
    }


    static boolean concatenate(int x, int y){

        int forward = Integer.parseInt(String.valueOf(x) + String.valueOf(y));
        int reverse = Integer.parseInt(String.valueOf(y) + String.valueOf(x));

        return isPrime(forward) && isPrime(reverse);

    }

    static ArrayList<Integer> genPrimeList(){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < 100000; i++){
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }

    static boolean isPrime(int num) {
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
