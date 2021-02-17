import java.math.BigInteger;
import java.util.Arrays;

public class Problem61 {

    static void eConvergents(){

        Integer[] numList = genNumList();

        BigInteger den = BigInteger.valueOf(numList[99]);
        BigInteger num = BigInteger.valueOf(1);
        BigInteger temp;

        for (int i = 98; i > -1; i--){

            temp = (BigInteger.valueOf(numList[i]).multiply(den)).add(num);
            num = den;
            den = temp;

        }

        System.out.println("Numerator is : " + den);
        System.out.println("Denominator is: " + num);

        String newNum = den.toString();
        // the numerator and denominator were switched in the last cycle of the for loop, so I am just manually switching them back
        int count = 0;

        for (int i = 0; i < newNum.length(); i++){
            count += Character.getNumericValue(newNum.charAt(i));
            System.out.println(newNum.charAt(i) + " " + count);
        }

        System.out.println(count);
    }

    static Integer[] numGen(Integer[] numList){
        Integer[] num = new Integer[100];
        for (int i = 0; i < 99; i++){
            num[i] = 0;
        }
        num[99] = numList[99];
        return num;
    }

    static Integer[] denGen(Integer[] numList){
        Integer[] den = new Integer[100];
        for (int i = 0; i < 99; i++){
            den[i] = 0;
        }
        den[99] = numList[99];
        return den;
    }

    static Integer[] genNumList(){

        Integer[] numList = new Integer[100];
        numList[0] = 2;
        int n = 2;

        for (int i = 1; i < 100; i++){
            if ((i -2) % 3 == 0){
                numList[i] = n;
                n = n+2;
            }
            else{
                numList[i] = 1;
            }
        }

        return numList;
    }

}
