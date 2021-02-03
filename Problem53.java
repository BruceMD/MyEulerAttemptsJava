public class Problem53 {

    static void combinations(){

        int count = 0;

        for (int n = 1; n <= 100; n++){
            for (int r = 1; r <= n; r++){
                System.out.println(n + " " + r);
                if (fact(n) / (fact(r) * fact(n-r)) > 1000000){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static double fact(int num){
        if (num <= 1){return 1;}
        return num*fact(num-1);
    }

}
