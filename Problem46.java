import java.util.ArrayList;

public class Problem46 {

    static ArrayList<Integer> primeList = new ArrayList<>();
    static ArrayList<Integer> compList = new ArrayList<>();

    static void goldbach(){

        genPrimeList();

        for (int c : compList){
            if (!(c % 2 == 0) && c > 8){
                if (checkBach(c)){
                    System.out.println(c);
                    return;
                }
            }
        }
    }

    static boolean checkBach(int num){
        int p = 0;

        while(primeList.get(p) < num){
            int s = 1;
            while (s*s + primeList.get(p) <= num){
                if (primeList.get(p) + 2 * s*s == num){
                    System.out.println(num + " = " + primeList.get(p) + " + 2 X " + s + "**2");
                    return false;
                }
                s++;
            }
            p++;
        }
        return true;
    }

    static ArrayList<Integer> genPrimeList(){
        for (int i = 2; i < 10000; i++){
            if (isPrime(i)){
                primeList.add(i);
            }
            else{
                compList.add(i);
            }
        }
        return primeList;
    }

    static boolean isPrime(int num) {
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
