import java.util.ArrayList;
import java.util.Arrays;

public class Problem32 {

    static ArrayList<Integer> panArr = new ArrayList<>();

    static void pandigital(){
        for (int i = 1; i < 9877; i++){
            for (int j = 2; j < 9877; j++){
                if(isPan(i, j, i*j)){
                    if (!panArr.contains(i*j)){
                        panArr.add(i*j);
                    }
                }
            }
        }
        System.out.println(panArr);
        sumLis(panArr);

    }

    static void sumLis(ArrayList<Integer> lis){
        int count = 0;
        for (int n : lis){
            count += n;
        }
        System.out.println(count);
    }

    static boolean isPan(int muld, int muly, int prod){
        String numbers = "";
        numbers = String.valueOf(muld) + String.valueOf(muly) + String.valueOf(prod);
        if (numbers.length() != 9 || numbers.contains("0")){return false; }

        String[] numArr = new String[9];
        numArr = numbers.split("");
        Arrays.sort(numArr);

        if (check(numArr)){
            return true;}
        return false;
    }

    static boolean check(String[] lis){
        for (int i = 0; i < 9; i++){
            if (Integer.parseInt(lis[i]) != i+1){
                return false;
            }
        }
        return true;
    }
}
