import java.util.Arrays;

public class Problem56 {

    static void powerfulDigitSum(){

        int max = 0;

        for (int a = 2; a < 100; a++){
            for (int b = 2; b < 100; b++){
                int temp = digitSum(a, b);
                if (temp > max){
                    max  = temp;
                    System.out.println(a + " " + b);
                }
            }
        }

        System.out.println(max);

    }

    static Integer digitSum(int a, int b){
        int count  = 0;
        int[] numArray = new int[200];
        numArray[199] = 1;

        int carryOver = 0;

        for (int loops = 0; loops < b; loops++){
            for (int i = 199; i > -1; i--){
                numArray[i] = numArray[i] * a + carryOver;
                if (numArray[i] > 9){
                    carryOver = Math.floorDiv(numArray[i], 10);
                    numArray[i] = numArray[i] % 10;
                }
                else{
                    carryOver = 0;
                }
            }
//            System.out.println(Arrays.toString(numArray));
        }

        for (int i = 0; i < 200; i++){
            count += numArray[i];
        }

        return count;
    }

}
