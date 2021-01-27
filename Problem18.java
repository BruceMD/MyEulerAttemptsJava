import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {

    static void maxPath(){

        String[][] pyr = new String[15][];

        try {
            File myObj = new File("C:\\Users\\Administrator\\Desktop\\Project Euler\\p018_pyramid.txt");
            Scanner myReader = new Scanner(myObj);
            int n = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                pyr[n] = data.split(" ");
                n ++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < 15; i++){
            System.out.println(Arrays.toString(pyr[i]));
        }

        Integer[][] newPyr = conv(pyr);

        for (int i = 0; i < 15; i++){
            System.out.println(Arrays.toString(newPyr[i]));
        }

        for (int i = newPyr.length - 2; i > -1; i--){       // starting at the second last row
            for (int j = 0; j < 14; j++){
                newPyr[i][j] += Math.max(newPyr[i+1][j], newPyr[i+1][j+1]);
            }
        }

        System.out.println(newPyr[0][0]);

    }

    static Integer[][] conv(String[][] arr){

        Integer[][] newArr = new Integer[15][15];

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++){
                try{
                    newArr[i][j] = Integer.parseInt(arr[i][j]);
                }
                catch(Exception e){
                    newArr[i][j] = 0;
                }
            }
        }

        return newArr;
    }

}
