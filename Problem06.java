public class Problem6 {

    static void difference(){
        System.out.println(squareOfSums() - sumOfSquares());
    }

    static Long sumOfSquares(){
        long count = 0;
        for(int i = 1; i < 101; i++){
            count += i*i;

        }

        return count;
    }

    static Long squareOfSums(){
        long count = 0;
        for(int i = 1; i < 101; i++){
            count += i;

        }

        return count*count;
    }

}
