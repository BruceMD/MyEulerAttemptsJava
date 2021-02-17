import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem59 {

    static void XOR(){

        String[] encText = ReadFile();

        for (int a = 97; a < 123; a++){
            for (int b = 97; b < 123; b++){
                for (int c = 97; c < 123; c++){
                    int temp = convert(a, b, c, encText);
                    if (temp > 0){
                        System.out.println(temp);
                        return;
                    }
                }
            }
        }

    }

    static Integer convert(int a, int b, int c, String[] encrypted){
        String originalText = "";

        int n = 0;
        while (n < encrypted.length){

            originalText += (char) (Integer.parseInt(encrypted[n]) ^ a);
            originalText += (char) (Integer.parseInt(encrypted[n+1]) ^ b);
            originalText += (char) (Integer.parseInt(encrypted[n+2]) ^ c);

            n = n+3;
        }

        int count = 0;

        if (originalText.contains("Euler")){
            System.out.println(originalText);
            for (int i = 0; i < originalText.length(); i++){
                count += (int)originalText.charAt(i);
            }
            return count;
        }
        return 0;
    }

    static String[] ReadFile(){
        String[] numbers = new String[0];
        try {
            File myObj = new File("C:\\Users\\Administrator\\Desktop\\p059_cipher.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                numbers = data.split(",");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return numbers;
    }

}
