import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem15 {

    static int count = 0;

    static Map<int[], Integer> gridCount = new HashMap<int[], Integer>();

    static void lattice(){

        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                count = 0;
                grid(0, 0, i, j);
                int[] tempArr = {i, j};
                gridCount.put(tempArr, count);
                System.out.println(gridCount.containsKey(tempArr));
                System.out.println(tempArr[0] + " " + tempArr[1]);
                System.out.println(gridCount.size());
            }
        }

        System.out.println(count);

        System.out.println(gridCount.get(new int[]{19, 19}));

    }

    static void grid(int x, int y, int limx, int limy){



        int[] checkArr = {x, y};
        if (gridCount.containsKey(checkArr)){
            System.out.println("Saved time! at " + x + y);
            count += gridCount.get(checkArr);
            return;
        }

        if (x == limx && y == limy){
            count ++;
            return;
        }
        else if (x == limx && y < limy){
            grid(x, y+1, limx, limy);
        }
        else if(x < limx && y == limy){
            grid(x + 1, y, limx, limy);
        }
        else{
            for (int i = 0; i < 2; i++){
                if (i == 0){
                    grid(x + 1, y, limx, limy);
                }
                else{
                    grid(x, y + 1, limx, limy);
                }
            }
        }
    }

}
