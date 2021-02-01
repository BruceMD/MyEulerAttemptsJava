import java.util.ArrayList;

public class Problem44 {

    static void pentagonNum(){
        ArrayList<Double> penArr = genPenLis(10000);

        for (int i = 0; i < 9999; i++){
            for (int j = i+1; j < 10000; j++){
                double sumPen = penArr.get(i) + penArr.get(j);
                double diffPen = penArr.get(j) - penArr.get(i);
                if (penArr.contains(sumPen) && penArr.contains(diffPen)){
                    System.out.println(diffPen + " " + penArr.get(j) + " " + penArr.get(i));
                }
            }
        }

    }

    static ArrayList<Double> genPenLis(int num){

        ArrayList<Double> arr = new ArrayList<>();
        for (double i = 1; i < num+1; i++){
            arr.add((3*i*i - i)/2);
        }
        return arr;
    }
}
