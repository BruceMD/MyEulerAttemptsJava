import java.util.ArrayList;

public class Problem69 {

    static void totientMax(){


    }

    static Integer phiFunc(int num){
        int count = 0;

        

        return count;
    }
    
    static ArrayList<Integer> factors(int num){
        
        for (int i = 2; )
        
    }
    
    static ArrayList<Integer> primeList(){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        
        for (int i = 3; i < 1000000; i = i+2){
            if (isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
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
