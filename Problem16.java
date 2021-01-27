import java.util.Arrays;

public class Problem16 {

    static void digitSum(){

        int[] digit = new int[320];

        digit[319] = 1;

        System.out.println(Arrays.toString(digit));

        for (int i = 0; i < 1000; i++){
            int carryOver = 0;
            for (int j = 319; j > -1; j--){
                digit[j] = digit[j] * 2 + carryOver;
                if (digit[j] > 9){
                    digit[j] = digit[j] % 10;
                    carryOver = 1;
                }
                else{
                    carryOver = 0;
                }
            }
            System.out.println(Arrays.toString(digit));
        }

        int count = 0;

        for (int k = 0; k < 320; k++){
            count += digit[k];
        }

        System.out.println(count);

    }

}
