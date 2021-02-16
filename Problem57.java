import java.util.Arrays;

public class Problem57 {

    static void squareRootConvergents(){
        int count = 0;
        for (int i = 1; i < 1001; i++){
            if (sumFractions(i)){
//                System.out.println(i + "TRUE");
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean sumFractions(int cycles){

        Integer[] num = numGen();
        Integer[] den = denGen();
        Integer[] tempDen;

        while (cycles > 1){
            tempDen = tempDenGen(num, den);          // change numerator
            num = den;                  // swap num and den
            den = tempDen;
            cycles--;
        }

        return finalAnswer(num, den);

    }

    static boolean finalAnswer(Integer[] num, Integer[] den){
        int carryOver = 0;
        for (int i = 499; i > -1; i--){
            num[i] = num[i] + den[i] + carryOver;
            if (num[i] > 9){
                carryOver = Math.floorDiv(num[i], 10);
                num[i] = num[i] % 10;
            }
            else{
                carryOver = 0;
            }
        }

        int numStop = 0;
        int denStop = 0;

        for (int i = 0; i < 500; i++){
            if (num[i] != 0){
                numStop = 500 - i;
                break;
            }
        }
        for (int i = 0; i < 500; i++){
            if (den[i] != 0){
                denStop = 500 - i;
                break;
            }
        }

//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(den));

        return numStop > denStop;

    }

    static Integer[] tempDenGen(Integer[] num, Integer[] den){
        Integer[] tempDen = new Integer[500];
        int carryOver = 0;
        for (int i = 499; i > -1; i--){
            tempDen[i] = 2 * den[i] + num[i] + carryOver;
            if (tempDen[i] > 9){
                carryOver = Math.floorDiv(tempDen[i], 10);
                tempDen[i] = tempDen[i] % 10;
            }
            else{
                carryOver = 0;
            }
        }
        return tempDen;
    }

    static Integer[] numGen(){
        Integer[] num = new Integer[500];
        for (int i = 0; i < 499; i++){
            num[i] = 0;
        }
        num[499] = 1;
        return num;
    }

    static Integer[] denGen(){
        Integer[] den = new Integer[500];
        for (int i = 0; i < 499; i++){
            den[i] = 0;
        }
        den[499] = 2;
        return den;
    }

    static double squareRootTwo(int cycles){

        if (cycles < 1){
            return 2;
        }
        return 2 + 1 / squareRootTwo(cycles-1);

    }

}
