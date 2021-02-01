import java.util.ArrayList;

public class Problem47 {

    static void distinctPrimes(){
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
            if (factorCount(num+a) != 4){
                return false;
            }
        }
        return true;

    }

    static Integer factorCount(int num){
        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> primeLis = genPrimeList();

        int p = 0;
        while (num > 1){
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
        return factors.size();
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
