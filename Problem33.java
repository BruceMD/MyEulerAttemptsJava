import java.util.ArrayList;

public class Problem33 {

    static void digitCancel(){

        double totalNum = 1;
        double totalDen = 1;

        for (double num = 10; num < 99; num ++){
            for (double den = num + 1; den < 100; den++){
                if (num % 10 != 0 && den % 10 != 0){
                    if (num/den == frac(num, den)){
                        totalNum *= num;
                        totalDen *= den;
                    }
                }
            }
        }
        System.out.println(totalNum);
        System.out.println(totalDen);
        simplify(totalNum, totalDen);
    }

    static void simplify(double num, double den){
        ArrayList<Integer> pLis = primeList();
        
        double newNum = num;
        double newDen = den;
        int n = 0;
        
        while (n < pLis.size()){
            if (newNum % pLis.get(n) == 0 && newDen % pLis.get(n) == 0){
                newNum = newNum / pLis.get(n);
                newDen = newDen / pLis.get(n);
            }
            else {
                n++;
            }
        }
        System.out.println(newNum);
        System.out.println(newDen);
    }

    static ArrayList<Integer> primeList(){
        ArrayList<Integer> pList = new ArrayList<>();

        for (int i = 2; i < 100; i++){
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

    static double frac(double num, double den){
        if (num % 10 == (Math.floorDiv((int)den, 10))){
            return Math.floorDiv((int)num, 10) / (den%10);
        }
        else if (Math.floorDiv((int)num, 10) == den%10){
            return (num%10) / Math.floorDiv((int)den, 10);
        }
        else {
            return 0;
        }
    }
}
