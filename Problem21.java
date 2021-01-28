public class Problem21 {

    static void amicableSum(){

        int sum = 0;

        for (int i = 2; i < 10000; i++){
            int temp = amicable(i);
            if (i == amicable(temp)){
                System.out.println("BBBAAAAAMMMMMMMM" + temp + " " + i);
                sum += i;
            }
        }

        System.out.println(sum);

    }

    static Integer amicable(int num){

        if (num == 1){
            return 0;
        }

        int count = 0;
        for (int i = 1; i < Math.floorDiv(num, 2) + 1; i++){
            if (num % i == 0){
                count += i;
            }
        }
        if (count == num){
            return 0;
        }

        return count;
    }


}
