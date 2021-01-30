import java.util.ArrayList;

public class Problem37 {

    static ArrayList<Integer> pLis = primeList();

    static void truncatable(){

        int count = 0;
        for (int p : pLis){
            if (p > 10){
                if (truncateLeft(p) && truncateRight(p)){
                    System.out.println(p);
                    count += p;
                }
            }
            }
        System.out.println(count);
    }

    static boolean truncateLeft(int num){
        int lim =  (int)Math.log10(num);
        for (int i = 0; i < lim; i++){
            num = (int) (num % Math.pow(10, Math.floor(Math.log10(num))));
//            System.out.println(num);
            if (!pLis.contains(num)){
                return false;
            }
        }
        return true;
    }

    static boolean truncateRight(int num){
        int lim = (int)Math.log10(num);
        for (int i = 0; i < lim; i++){
            num = Math.floorDiv(num, 10);
//            System.out.println(num);
            if (!pLis.contains(num)){
                return false;
            }
        }
        return true;
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
