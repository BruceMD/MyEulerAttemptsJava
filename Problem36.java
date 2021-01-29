import java.util.ArrayList;

public class Problem35 {

    static ArrayList<Integer> pList = primeList();

    static void primeCirlces(){

        System.out.println(pList);
        int tally = 0;
        for (int num : pList){
            if (pCircle(num)){
                System.out.println(num);
                tally++;
            }
        }
        System.out.println(tally);
    }

    static boolean pCircle(int num){
        for (int turns = 0; turns < (int) Math.log10(num) + 1; turns++){
            num = rotate(num);
            if (!pList.contains(num)){
                return false;
            }
        }
        return true;
    }

    static Integer rotate(int num){
        if (num < 10){
            return num;
        }
        int lastDigit = num % 10;
        num = Math.floorDiv(num, 10);

        num += lastDigit * Math.pow(10, (int)Math.log10(num) + 1);
        return num;
    }

    static ArrayList<Integer> primeList(){
        ArrayList<Integer> pList = new ArrayList<>();

        for (int i = 2; i < 1000000; i++){
            if (isPrime(i)){
                pList.add(i);
            }
        }

        return pList;
    }

    static Boolean isPrime(int x){

        if (x < 2){ return false; }
        if (x == 2){ return true; }

        for (int i = 2; i < Math.sqrt(x)+1; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }
}
