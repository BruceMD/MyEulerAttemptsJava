import java.util.ArrayList;
import java.util.Arrays;

public class Problem49 {

    static ArrayList<Integer> primeList = new ArrayList<>();
    static ArrayList<Integer[]> primeArrayList = new ArrayList<>();

    static void primePerms(){

        genPrimes();

        for (int p : primeList){
            primeArrayList.add(convert(p));
        }

        for (int i = 0; i < primeList.size() - 1; i++){
            ArrayList<Integer> tempPrimeList = new ArrayList<>();

            for (int j = i; j < primeList.size(); j++){
                if (equalArr(primeArrayList.get(i), primeArrayList.get(j))){
                    tempPrimeList.add(primeList.get(j));
                }
            }

            if (tempPrimeList.size() > 2){
                checkInterval(tempPrimeList);
            }
        }
    }

    static boolean checkInterval(ArrayList<Integer> arr){

        for (int i = 0; i < arr.size()-2; i++){
            for (int j = i+1; j < arr.size()-1; j++){
                for (int k = j+1; k < arr.size(); k++){
                    if (arr.get(k) - arr.get(j) == arr.get(j) - arr.get(i)){
                        System.out.println(arr.get(i) + "" + arr.get(j) + "" + arr.get(k));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static Integer[] convert(int num){

        Integer[] arr = new Integer[4];
        int n = 0;
        while(num > 0){
            arr[n] = num % 10;
            num = Math.floorDiv(num, 10);
            n++;
        }
        Arrays.sort(arr);
        return arr;
    }

    static boolean equalArr(Integer[] arr1, Integer[] arr2){
        for (int i = 0; i < 4; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    static void genPrimes(){
        for (int i = 1001; i < 10000; i = i+2){
            if (isPrime(i)){
                primeList.add(i);
            }
        }

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
