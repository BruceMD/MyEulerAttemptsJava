import java.text.DecimalFormat;
import java.util.Arrays;

public class Problem62 {

    static void cubicPermutations(){

        int[] index = new int[100000];
        String[] cubes = new String[100000];

        for (int i = 0; i < 100000; i++){
            index[i] = i;
            cubes[i] = doubleToString(i);

//            System.out.println(i + " " + cubes[i]);
        }

        for (int i = 0; i < 100000; i++){
            int count = 0;
            for (int j = i+1; j < 10000; j++){
                if (cubes[i].equals(cubes[j])){
                    count++;
                }
            }
            if (count == 4){
                System.out.println(i);
                System.out.printf("%.0f", Math.pow(i, 3));
                return;
            }
        }
    }


    static String doubleToString(double num){

        DecimalFormat df = new DecimalFormat("###############");
        String word = df.format(Math.pow(num, 3));
        char tempArray[] = word.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
