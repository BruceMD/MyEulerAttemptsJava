import java.math.BigInteger;
import java.util.ArrayList;

public class Problem29 {

    static void distinctPowers() {

        ArrayList<BigInteger> bigArr = new ArrayList<>();

        for (int a = 2; a < 101; a++){
            for (int b = 2; b < 101; b++){
                BigInteger bigA = new BigInteger("1");
                for (int c = 0; c < b; c++){
                    bigA = bigA.multiply(BigInteger.valueOf(a));
                }
                bigArr.add(bigA);
            }
        }
        System.out.println(bigArr.size());
        ArrayList<BigInteger> newArr = removeDuplicates(bigArr);
        System.out.println(newArr.size());
    }

    static ArrayList<BigInteger> removeDuplicates(ArrayList<BigInteger> oldLis){

        ArrayList<BigInteger> newLis = new ArrayList<BigInteger>();
        for (BigInteger n : oldLis){
            if (!newLis.contains(n)){
                newLis.add(n);
            }
        }
        return newLis;
    }

}
