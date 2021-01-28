import java.util.ArrayList;

public class Problem24 {

    static int count = 0;

    static void permutations(){

        ArrayList<Integer> lis = genLis();
        ArrayList<Integer> empty = new ArrayList<>();
        rec(lis, empty);

    }

    static void rec(ArrayList<Integer> lis, ArrayList<Integer> perm){

//        System.out.println(perm);
        if (perm.size() == 10){
//            System.out.println(perm);
            count ++;
            if (count == 1000000){
                printAnswer(perm);
            }
            return;
        }

        for (int num : lis){
            ArrayList<Integer> newLis = new ArrayList<>();
            ArrayList<Integer> newPerm = new ArrayList<>();

            newLis = removeFunc(lis, num);
            newPerm = addFunc(perm, num);

            rec(newLis, newPerm);
        }

    }

    static void printAnswer(ArrayList<Integer> ans){

        long answer = 0;

        for (int i : ans){
            answer = answer*10 + i;
        }

        System.out.println(answer);
    }

    static ArrayList<Integer> addFunc(ArrayList<Integer> lis, Integer num){

        ArrayList<Integer> newLis = new ArrayList<>();
        for (int n : lis){
            newLis.add(n);
        }
        newLis.add(num);
        return newLis;
    }

    static ArrayList<Integer> removeFunc(ArrayList<Integer> lis, Integer num){

        ArrayList<Integer> newLis = new ArrayList<>();
        for (int n : lis){
            if (n != num){
                newLis.add(n);
            }
        }
        return newLis;
    }

    static ArrayList<Integer> genLis(){
        ArrayList<Integer> lis = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            lis.add(i);
        }
        return lis;
    }

}
