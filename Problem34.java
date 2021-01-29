public class Problem34 {

    static void digitFac(){

        int total = 0;

        for (int i = 3; i < 1000000; i++){
            if (i == digFac(i)){
                System.out.println(i);
                total += i;
            }
        }
        System.out.println(total);
    }

    static Integer digFac(int num){
        int total = 0;
        while (num > 0){
            total +=fact(num % 10);
            num = Math.floorDiv(num, 10);
        }
        return total;
    }

    static Integer fact(int num){
        if (num <= 1){
            return 1;
        }
        return num * fact(num-1);

    }

}
