import java.util.ArrayList;

public class Problem38 {

    static ArrayList<Integer> record = gen();
    static ArrayList<Integer> newRec = new ArrayList<>();

    static void panDigital(){

//        isPan(192);

        for (int i = 1; i < 987654; i++){
            if(isPan(i)){
                if(checkMax(record, newRec)){
                    record = newRec;
                }
            }
        }
        printAnswer(record);

    }

    static boolean isPan(int num){
        int n = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n < 10){
            arr.add(n*num);
            if (!checkRepeat(arr)){                 // false means there is a repeat
                return false;
            }
            if (checkPan(arr)){
                System.out.println(num + " " + correct(arr));
                newRec = correct(arr);
                return true;
            }
            n++;
        }
        return false;
    }

    static boolean checkRepeat(ArrayList<Integer> oldArr){

        ArrayList<Integer> arr = correct(oldArr);

        if (arr.contains(0)){
            return false;
        }
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int n : arr){
            if (newArr.contains(n)){
                return false;
            }
            newArr.add(n);
        }
        return true;
    }

    static boolean checkPan(ArrayList<Integer> oldArr){

        ArrayList<Integer> arr = correct(oldArr);

        for (int i = 1; i < 10; i++){
            if (!arr.contains(i)){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> correct(ArrayList<Integer> oldArr){

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < oldArr.size(); i++){
            int temp = oldArr.get(i);
            while (temp > 10){
                arr.add(Math.floorDiv(temp, (int)Math.pow(10, (int)Math.log10(temp))));
                temp = temp % (int)Math.pow(10, ((int)Math.log10(temp)));
            }
            arr.add(temp);
        }
        return arr;
    }

    static boolean checkMax(ArrayList<Integer> oldMax, ArrayList<Integer> newMax){

        for (int i = 0; i < 9; i++){
            if (newMax.get(i) > oldMax.get(i)) {
                return true;
            }
            else if (newMax.get(i) < oldMax.get(i)){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> gen(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        return temp;
    }

    static void printAnswer(ArrayList<Integer> arr){
        int answer = 0;
        for (int a : arr){
            answer = answer*10 + a;
        }
        System.out.println(answer);
    }
}
