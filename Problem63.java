public class Problem63 {

    static void powerfulDigitCounts(){

        int count  = 0;

        for (int i = 0; i < 10; i++){
            int n = 1;
            while (true){
                if (Math.ceil(Math.log10(Math.pow(i, n)+1)) == n){
                    System.out.println(i + " " + n + " " + Math.pow(i, n));
                    count++;
                    n++;
                }
                else{
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
