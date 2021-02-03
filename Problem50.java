import java.util.ArrayList;


public class Problem50 {

    static ArrayList<Integer> primeList = new ArrayList<>();

    static void consecPrime(){
        primeList.add(2);
        genPrimes();

        int max = 0;

        int start = 0;
        int length = 1000;
        int total = sumLis(start, length, primeList);

        int check = 0;

        while (length >= check){
            System.out.println(length);
            if (total > 1000000){
                start = 0;
                length --;
                total = sumLis(start, length, primeList);
            }                       // if too large, then start from the beginning with a smaller sliding window
            else{
                if (isPrime(total)) {
                    System.out.println(start + " " + length + " " + total);
                    System.out.println(primeList.get(start) + " " + primeList.get(length+start));
                    if (total > max) {
                        max = total;
                        check = length;                     // we don't want to find any prime numbers with a lower length
                    }
                }
                start++;
                total = sumLis(start, length, primeList);
            }
        }
        System.out.println("LARGEST PRIME: " + max);
    }

    static Integer sumLis(int start, int length, ArrayList<Integer> arr){
        int total = 0;
        for (int i = start; i < start + length; i++){
            total += arr.get(i);
            if (total > 1000000){
                return total;
            }
        }
        return total;
    }

    static void genPrimes(){
        for (int i = 3; i < 1000000; i = i+2){
            if (isPrime(i)){
                primeList.add(i);
            }
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
