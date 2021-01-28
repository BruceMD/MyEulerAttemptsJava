import java.util.Arrays;

public class Problem26 {

    static int count = 0;

    static void fractions(){

        for (int den = 1; den < 1000; den++){
            Integer[] lis = genLis();
            int n = 1;
            int rem = 1;
            while(true){
                if (rem % den == 0){
                    break;                      // not recurring
                }
                else if (rem > den){
                    rem = (rem % den) * 10;

                }
                else {
                    rem = rem*10;
                }
                lis[n] = rem;
                n++;
                if (pattern(lis, den)){
                    break;
                }
                if (n >= 999){
                    System.out.println("BROKEN");
                    break;
                }
            }


        }

    }

    static boolean pattern(Integer[] lis, int num){

        int lim = 999;
        while (lis[lim] != 0){
            lim--;
        }

        for (int i = 1; i < lim; i++) {
            for (int j = i + 1; j < lim+1; j++) {
                if (lis[i].equals(lis[j]) && lis[i] != 0){
                    Integer[] temp = Arrays.copyOfRange(lis, i, j);
//                    System.out.println(num + " " + Arrays.toString(temp) + " " + Arrays.toString(lis));
                    if (j-i > count){
                        count = j-i;
                        System.out.println(num + " " + count);
                    }
                    return true;
                }
            }
        }

        return false;
    }

    static Integer[] genLis(){
        Integer[] lis = new Integer[1000];
        for (int i = 0; i < 1000; i++){
            lis[i] = 0;
        }
        return lis;
    }
}
