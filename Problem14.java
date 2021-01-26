import java.util.Arrays;

public class Problem14 {

    static void longCollatz(){

        int maxCount = 0;
        int maxID = 0;

        int[] collArr = new int[1000001];

        for (int i = 1; i < 1000000; i++){
            int count = 0;
            long n = i;
            while(n != 1){
                if(n < 1000000){
                    if (collArr[(int)n] > 0){
                        count += collArr[(int)n];
                        break;
                    }
                }
                if (n % 2 == 0){
                    n = n/2;
                }
                else{
                    n = 3*n + 1;
                }
                count ++;
            }

            collArr[i] = count;

            if (count > maxCount){
                System.out.println(i);
                maxCount = count;
                maxID = i;
            }
        }

        System.out.println(maxID);

    }
}
