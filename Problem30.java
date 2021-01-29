public class Problem30 {

    static void fifthPower(){

        int total = 0;

        for (int n = 2; n < 1000000000; n++){
            int temp = n;
            int count = 0;
            while(temp > 0){
                count += power5(temp % 10);
                temp = Math.floorDiv(temp, 10);
            }
            if (count == n){
                System.out.println(n);
                total += count;
            }
        }

        System.out.println(total);

    }

    static Integer power5(int x){
        if (x == 1) {return 1;}
        else if (x == 2) {return 32;}
        else if (x == 3) {return 243;}
        else if (x == 4) {return 1024;}
        else if (x == 5) {return 3125;}
        else if (x == 6) {return 7776;}
        else if (x == 7) {return 16807;}
        else if (x == 8) {return 32768;}
        else if (x == 9) {return 59049;}
        else {return 0;}
    }

}
