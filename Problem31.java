import java.util.ArrayList;

public class Problem31 {

    static int count = 0;

    static void coinSums(){

        Integer[] coins = genCoins();

        rec(0, coins);
        System.out.println(count);
    }

    static void rec(int total, Integer[] coins){
        if (total == 200){
            count += 1;
            return;
        }

        for (int c : coins){
            if (c + total <= 200){
                rec(total+c, restrict(c, coins));
            }
        }
    }

    static Integer[] restrict(int num, Integer[] arr){
        ArrayList<Integer> tempArr = new ArrayList<>();

        for (int n : arr){
            if (n <= num){
                tempArr.add(n);
            }
        }
        Integer[] newArr = new Integer[tempArr.size()];
        for (int n = 0; n < tempArr.size(); n++){
            newArr[n] = tempArr.get(n);
        }
        return newArr;
    }

    static Integer[] genCoins(){
        Integer[] coins = new Integer[8];
        coins[0] = 1;
        coins[1] = 2;
        coins[2] = 5;
        coins[3] = 10;
        coins[4] = 20;
        coins[5] = 50;
        coins[6] = 100;
        coins[7] = 200;
        return coins;
    }

}
