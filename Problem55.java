import java.util.ArrayList;

public class Problem55 {

    static void lychrelNumbers(){
        int count = 0;
        for (int i = 0; i < 10000; i++){
            if (!notLychrel(String.valueOf(i), 0)){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("TOTAL IS : " + count);
    }

    static boolean notLychrel(String num, int count){
        if (count == 51){return false;}

        String newNum = reverseSum(num);

        if (isPalindrome(newNum)){
            return true;
        }
        return notLychrel(newNum, count + 1);
    }

    static Boolean isPalindrome(String num){

        int i = 0, j = num.length() - 1;
        while(i < j){
            if (num.charAt(i) != num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static String reverseSum(String num){
        String answer = "";
        String numRev = "";

        for (int i = num.length() - 1; i > -1; i--){
            numRev += num.charAt(i);
        }
        int carryOver = 0;
        for (int j = num.length() - 1; j > -1; j--){
            int temp = Integer.parseInt(String.valueOf(num.charAt(j))) + Integer.parseInt(String.valueOf(numRev.charAt(j))) + carryOver;
            if (temp > 9){
                carryOver = 1;
                temp = temp % 10;
            }
            else{
                carryOver = 0;
            }
            answer = temp + answer;
        }
        if (carryOver > 0){
            answer = carryOver + answer;
        }
        return answer;
    }

}
