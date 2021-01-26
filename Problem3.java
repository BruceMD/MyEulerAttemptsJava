import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    static void maxPrime(){

        List<Integer> primeList = genPrime();

        for (int i = 0; i < primeList.size(); i++){
            if (600851475143L % primeList.get(i) == 0){
                System.out.println(primeList.get(i));
            }

        }
    }

    static List<Integer> genPrime(){
        List<Integer> primeList = new ArrayList<>();

        for (int i = 3; i < Math.sqrt(600851475143L); i += 2){
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        System.out.println(primeList);
        return primeList;
    }

    static Boolean isPrime(int x){
        for (int i = 2; i < Math.sqrt(x)+1; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }
}
