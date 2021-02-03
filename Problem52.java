import java.util.Arrays;

public class Problem52 {

    static void permutedMultiples(){

        for (int i = 0; i < 8; i++){
            for (int j = (int) Math.pow(10, i); j < 1.7 * (int)Math.pow(10, i); j++){       // do not want to exceed 1.7 * 10**x because 1.7 * 6 will have an extra digit more than the the original number
                if (options(j)){
                    System.out.println(j);
                    return;
                }
            }
        }

    }

    static boolean options(int num){
        for (int k = 2; k < 7; k++){
            if (!permuted(num, k)){
                return false;
            }
        }
        return true;
    }

    static boolean permuted(int num, int multiplier){

        String oldNum = sort(String.valueOf(num));
        String newNum = sort(String.valueOf(num*multiplier));
        return (oldNum.equals(newNum));
    }

    static String sort(String num){
        char tempArray[] = num.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
