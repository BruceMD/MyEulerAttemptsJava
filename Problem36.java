import java.util.Arrays;

public class Problem36 {

    static Integer[] binList = binGen();

    static void doublePalindrome(){

        int total = 0;

        for (int i = 1; i < 1000000; i++){
            if (isPalindrome(String.valueOf(i))){
                if (isPalindrome(binary(i))){
                    total += i;
                }
            }
        }
        System.out.println(total);
    }

    static boolean isPalindrome(String num){
        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    static String binary(int num){
        String bin = "";
        for (int i = 19; i > -1; i--){
            if (num >= binList[i]){
                bin += "1";
                num -= binList[i];
            }
            else{
                if (bin.length() > 0){
                    bin += "0";
                }
            }
        }
 //       System.out.println(bin);
        return bin;
    }

    static Integer[] binGen(){
        Integer[] binLis = new Integer[20];
        int n = 2;
        for (int i = 0; i < 20; i++){
            binLis[i] = (int)Math.pow(n, i);
        }
        System.out.println(Arrays.toString(binLis));
        return binLis;
    }
}
