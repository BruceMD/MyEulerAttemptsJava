import java.util.HashMap;
import java.util.Map;

public class Problem15 {

    static int count = 0;

    static Map<int[], Integer> map = new HashMap<int[], Integer>();

    static void lattice(){

        System.out.println(count);

        grid(0, 0, 5, 5);

        System.out.println(count);

    }

    static void grid(int x, int y, int limx, int limy){

        System.out.println(x + " " + y);

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
