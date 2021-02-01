import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem42 {

    static void codedTriNum(){

        int count = 0;

        ArrayList<Integer> numLis = triNumGen();

        String[] wordArray = readFile().split(",");

        for (String word : wordArray){
            if (numLis.contains(isTriNum(word))){
                count++;
                System.out.println("My Word is: " + word);
            }
        }
        System.out.println("FINALLY : " + count);
    }

    static Integer isTriNum(String word){

        int wordValue = 0;

        for (int i = 0; i < word.length(); i++){
            wordValue += ord(Character.toString(word.charAt(i)));
        }
        return wordValue;
    }

    static ArrayList<Integer> triNumGen(){
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 30; i++){
            arr.add((i*i +i)/2);
        }
        return arr;
    }

    static Integer ord(String let){

        if (let.equals("A")){ return 1;}
        else if (let.equals("B")){ return 2;}
        else if (let.equals("C")){ return 3;}
        else if (let.equals("D")){ return 4;}
        else if (let.equals("E")){ return 5;}
        else if (let.equals("F")){ return 6;}
        else if (let.equals("G")){ return 7;}
        else if (let.equals("H")){ return 8;}
        else if (let.equals("I")){ return 9;}
        else if (let.equals("J")){ return 10;}
        else if (let.equals("K")){ return 11;}
        else if (let.equals("L")){ return 12;}
        else if (let.equals("M")){ return 13;}
        else if (let.equals("N")){ return 14;}
        else if (let.equals("O")){ return 15;}
        else if (let.equals("P")){ return 16;}
        else if (let.equals("Q")){ return 17;}
        else if (let.equals("R")){ return 18;}
        else if (let.equals("S")){ return 19;}
        else if (let.equals("T")){ return 20;}
        else if (let.equals("U")){ return 21;}
        else if (let.equals("V")){ return 22;}
        else if (let.equals("W")){ return 23;}
        else if (let.equals("X")){ return 24;}
        else if (let.equals("Y")){ return 25;}
        else if (let.equals("Z")) {return 26;}
        return 0;
    }

    static String readFile(){
        String words = "";

        try {
            File myObj = new File("C:\\Users\\Administrator\\Desktop\\Project Euler\\words.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                words += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return words;
    }

}
