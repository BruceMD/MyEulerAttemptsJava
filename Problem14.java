import java.util.Arrays;

public class Problem14 {

    static void longCollatz(){

        long[] collArr = new long[1000001];

        for(int i = 1; i < 1000000; i++){
            long count = 0;
            long n = i;
            while(n != 1){
                if (n < 1000000 && collArr[n] > 0){
                    collArr[i] = count + collArr[n];
                    System.out.println("Bang, shortened!");
                }
                if (n % 2 == 0){
                    n /= 2;
                }
                else{
                    n = 3*n+1;
                }
                count ++;
            }
            System.out.println(i);
            System.out.println(count);
        }

        System.out.println(Arrays.toString(collArr));

    }
}
