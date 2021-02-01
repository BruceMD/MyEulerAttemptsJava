import java.util.ArrayList;

public class Problem45 {

    static void tph(){

        ArrayList<Double> answers = new ArrayList<>();

        int h = 1;

        while (h < 100000){
            double hex = 2*Math.pow(h, 2) - h;
            double triNum = (Math.sqrt(8*hex + 1) + 1)/2;
            double penNum = (Math.sqrt(24*hex + 1) + 1)/6;
            if (triNum % 1 == 0 && penNum % 1 == 0){
                System.out.println("Answer " + hex);
                answers.add(hex);
            }
            h++;
        }
        System.out.printf("%.1f", answers.get(2));
    }

}
