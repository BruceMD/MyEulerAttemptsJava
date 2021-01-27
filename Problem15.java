import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem15 {

    static long count = 0;

    static Map<String, Long> gridCount = new HashMap<String, Long>();

    static void lattice(){

        gridCount.put("UU", 0L);

        for (int i = 20; i > -1; i--){
            for (int j = 20; j > -1; j--){
                count = 0;
                grid(i, j, 20, 20);
                gridCount.put(ref(i)+ref(j), count);
//                System.out.println(ref(i) + ref(j) + " " + gridCount.get(ref(i) + ref(j)));
            }
        }

        System.out.println(gridCount.get("UU"));

        System.out.println(gridCount.get("AA"));

    }

    static void grid(int x, int y, int limx, int limy){

        if (x == limx && y == limy){
            count ++;
        }
        else if (x == limx && y < limy){
            grid(x, y+1, limx, limy);
        }
        else if(x < limx && y == limy){
            grid(x + 1, y, limx, limy);
        }
        else{
            if (gridCount.containsKey(ref(x)+ref(y))){
                count += gridCount.get(ref(x)+ref(y));
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

    static String ref(int num){

        if (num == 0){return "A"; }
        else if (num == 1) {return "B"; }
        else if (num == 2) {return "C"; }
        else if (num == 3) {return "D";}
        else if (num == 4) {return "E";}
        else if (num == 5) {return "F";}
        else if (num == 6) {return "G";}
        else if (num == 7) {return "H";}
        else if (num == 8) {return "I";}
        else if (num == 9) {return "J";}
        else if (num == 10) {return "K";}
        else if (num == 11) {return "L";}
        else if (num == 12) {return "M";}
        else if (num == 13) {return "N";}
        else if (num == 14) {return "O";}
        else if (num == 15) {return "P";}
        else if (num == 16) {return "Q";}
        else if (num == 17) {return "R";}
        else if (num == 18) {return "S";}
        else if (num == 19) {return "T";}
        else {return "U";}

    }


    static void combinations(){

        Long[][] grid = new Long[21][21];

        grid[0][0] = 0L;
        for (int i = 1; i < 21; i++){
            grid[i][0] = 1L;
            grid[0][i] = 1L;
        }

        for (int i = 1; i < 21; i++){
            for (int j = 1; j < 21; j++){
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }

        System.out.println(grid[20][20]);

    }

}
