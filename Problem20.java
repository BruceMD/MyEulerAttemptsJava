import java.util.Arrays;

public class Problem20 {

    static void facDigitSum(){

        int[] digit = new int[500];

        digit[499] = 1;

        System.out.println(Arrays.toString(digit));

        for (int i = 1; i < 101; i++){
            int carryOver = 0;
            for (int j = 499; j > -1; j--){
                digit[j] = digit[j] * i + carryOver;
                if (digit[j] > 9){
                    carryOver = Math.floorDiv(digit[j], 10);
                    digit[j] = digit[j] % 10;
                }
                else{
                    carryOver = 0;
                }
            }
            System.out.println(Arrays.toString(digit));
        }

        int count = 0;

        for (int k = 0; k < 500; k++){
            count += digit[k];
        }

        System.out.println(count);

    }

}
