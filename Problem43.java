import java.util.ArrayList;

public class Problem43 {

    static double count = 0;

    static void subString(){

        rec("", arrGen());

        System.out.printf("%.0f", count);
    }

    static void rec(String num, ArrayList<Integer> arr){

        if (num.length() == 10){
            if (!(Integer.parseInt(num.substring(7, 10)) % 17 == 0)){return;}
        }
        else if (num.length() == 9){
            if (!(Integer.parseInt(num.substring(6, 9)) % 13 == 0)){return;}
        }
        else if (num.length() == 8){
            if (!(Integer.parseInt(num.substring(5, 8)) % 11 == 0)){return;}
        }
        else if (num.length() == 7){
            if (!(Integer.parseInt(num.substring(4, 7)) % 7 == 0)){return;}
        }
        else if (num.length() == 6){
            if (!(Integer.parseInt(num.substring(3, 6)) % 5 == 0)){return;}
        }
        else if (num.length() == 5){
            if (!(Integer.parseInt(num.substring(2, 5)) % 3 == 0)){return;}
        }
        if (num.length() == 4){
            if (!(Integer.parseInt(num.substring(1, 4)) % 2 == 0)){return;}
        }

        if (arr.size() == 0){
            System.out.println(num);
            count += Double.valueOf(num);
            return;
        }
        for (int a : arr){
            rec(num + String.valueOf(a), newArr(a, arr));
        }
    }

    static ArrayList<Integer> newArr(int num, ArrayList<Integer> arr){

        ArrayList<Integer> newArr = new ArrayList<>();
        for (int a : arr){
            if (a != num){
                newArr.add(a);
            }
        }
        return newArr;
    }

        static ArrayList<Integer> arrGen(){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){arr.add(i); }
        return arr;
    }

    static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num) + 1; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
