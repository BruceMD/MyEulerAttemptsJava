import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;

public class Problem51 {

    static void primeFamily(){

        for (int i = 5; i < 7; i++){
            ArrayList<Integer> primes = genPrimes(i, i+1);
            for (int p : primes){
                String tempString = conv(p);
                if (zeroCount(tempString) == 3){
                    int count = 0;
                    for (int j = 1; j < 10; j++){
                        if (replace(tempString, j)){
                            count++;
                        }
                    }
                    if (count == 8){
                        System.out.println(p);
                    }
                }
            }
        }
    }

    static boolean replace(String strWord, int num){
        String newWord = "";
        for (int i = 0; i < strWord.length(); i++){
            if (strWord.charAt(i) == '1'){
                newWord += String.valueOf(num);
            }
            else{
                newWord += strWord.charAt(i);
            }
        }
        int newNum = Integer.parseInt(newWord);
        return (isPrime(newNum));
    }

    static Integer zeroCount(String numWord){                               // couldn't find an answer with 0, starting with 1 now
        int count = 0;
        for (int i = 0; i < numWord.length(); i++){
            if (numWord.charAt(i) == '1' && i != numWord.length() - 1) {
                count++;
            }
        }
        return count;
    }

    static String conv(int num){
        String numWord = "";
        numWord = String.valueOf(num);
        return numWord;
    }

    static ArrayList<Integer> genPrimes(int start, int end){

        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = (int)Math.pow(10, start); i < Math.pow(10, end); i++){
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
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
