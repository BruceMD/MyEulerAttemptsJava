import java.util.Arrays;

public class Problem25 {

    static void fibDig() {
        Integer[] lis1 = genLis();
        Integer[] lis2 = genLis();
        Integer[] lis3 = genLis();

        int carryOver = 0;

        int count = 2;

        while(lis3[0] == 0){
            count ++;
            for (int i = 999; i > -1; i--){
                lis3[i] = lis2[i] + lis1[i] + carryOver;
                carryOver = 0;
                if (lis3[i] > 9){
                    carryOver = 1;
                    lis3[i] = lis3[i] % 10;
                }
            }
            lis1 = replace(lis2);
            lis2 = replace(lis3);
            System.out.println(Arrays.toString(lis3));
        }

        System.out.println(count);
    }

    static Integer[] replace(Integer[] oldLis){

        Integer[] newLis = new Integer[1000];

        for (int n = 0; n < 1000; n++){
            newLis[n] = oldLis[n];
        }
        return newLis;
    }

    static Integer[] genLis(){

        Integer[] num1 = new Integer[1000];
        for (int i = 0; i < 1000; i++){
            if (i == 999){
                num1[i] = 1;
            }
            else{
                num1[i] = 0;
            }
        }

        return num1;
    }

}
