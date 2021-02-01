import java.util.ArrayList;

public class Problem41 {

    static int max = 0;

    static void panPrime(){

        for (int i = 1; i < 3; i++){
            rec(i, genArr(i));
        }
    }

    static void rec(int num, ArrayList<Integer> arr){
        System.out.println("THE NUM IS : " + num);
        if (arr.size() == 0){
            if (isPrime(num)){
                if (num > max){
                    max = num;
                    System.out.println(max);
                }
            }
            return;
        }
        System.out.println(arr);
        for (int a : arr){
            rec(num*10 + a, newArr(a, arr));
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

    static ArrayList<Integer> genArr(int num){
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < num+1; i++){
            arr.add(i);
        }
        return arr;
    }
    
    static boolean isPrime(int num){
        if (num % 2 == 0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(num)+1; i = i+2){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

}
