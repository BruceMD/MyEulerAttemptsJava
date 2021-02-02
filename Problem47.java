import java.util.ArrayList;

public class Problem47 {

    static ArrayList<Integer> primeLis = new ArrayList<>();

    static void distinctPrimes(){

        genPrimeList(1000000);

        int c = 500;
        while (true){
            if (consec(c)){
                System.out.println(c);
                return;
            }
            c++;
        }
    }

    static boolean consec(int num){
        for (int a = 0; a < 4; a++){
            if (!factorCount(num+a)){
                return false;
            }
        }
        return true;
    }

    static boolean factorCount(int num){
        ArrayList<Integer> factors = new ArrayList<>();

        int p = 0;
        while (num > 1){
            if (factors.size() > 4){
                return false;
            }
            int temp = primeLis.get(p);
            if (num % temp == 0){
                if (!factors.contains(temp)){
                    factors.add(temp);
                }
                num /= temp;
            }
            else{
                p++;
            }
        }
        System.out.println(factors);
        return factors.size() == 4;
    }

    static void genPrimeList(int num){

        for (int i = 2; i < num; i++){
            if (isPrime(i)){
                primeLis.add(i);
            }
        }
    }

    static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return true;
        }
        for (int i = 3; i < Math.sqrt(num) + 1; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
