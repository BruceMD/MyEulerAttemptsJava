import java.util.ArrayList;

public class Problem23 {

    static ArrayList<Integer> abundants = abundantList();

    static void nonAbundantSum(){

         long count = 0;

         for (int i = 1; i < 28214; i++){
             if (notAbundantSum(i)){
                 System.out.println(i);
                count += i;
             }
         }

        System.out.println(count);
    }

    static boolean notAbundantSum(int num){

        for (Integer num1 : abundants){
            if (num1 >= num){break;}
            for (Integer num2 : abundants){
                if (num2 >= num){break;}
                if (num == num1 + num2){
                    return false;
                }
            }
        }
        return true;
    }

    static ArrayList<Integer> abundantList(){

        ArrayList<Integer> abundants = new ArrayList<>();

        for (int n = 12; n < 28123; n++){
            if (abundant(n)){
                abundants.add(n);
            }
        }

        System.out.println(abundants);
        return abundants;
    }

    static Boolean abundant(int num){

        int count = 0;
        for (int i = 1; i < Math.floorDiv(num, 2) + 1; i++){
            if (num % i == 0){
                count += i;
            }
        }
        return (count > num);           // count > num - True = abundant
    }
}
