import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {

    static void nameScores(){

        long total = 0;

        String[] names = readFile();

        for (int n = 0; n < names.length; n++){
            total += ordConv(names[n]) * (n+1);
        }

        System.out.println(total);

    }

    static Integer ordConv(String name){

        int nameValue = 0;

        for (int c = 0; c < name.length(); c++){
            char ch = name.charAt(c);

            int ascii = ch;
            System.out.println(ch + " " + (ascii-64));
            nameValue += ascii - 64;
        }

        return nameValue;
    }

    static String[] readFile(){

        String[] names = new String[5163];

        try {
            File myObj = new File("C:\\Users\\ASUS\\Documents\\ProjectEuler\\names.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                names = data.split(",");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        return names;
    }
}
