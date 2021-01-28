import java.util.ArrayList;

public class Problem24 {

    static int count = 0;

    static void permutations(){

        ArrayList<Integer> lis = genLis();



    }

    static void rec(ArrayList<Integer> lis, ArrayList<Integer> perm){

        if (perm.size() == 9){
            System.out.println(perm);
            return;
        }

        for (int num : lis){
            ArrayList<Integer> tempLis = new ArrayList<>();
            tempLis = lis.remove(num);
        }

    }

    static ArrayList<Integer> genLis(){
        ArrayList<Integer> lis = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            lis.add(i);
        }
        return lis;
    }

}
