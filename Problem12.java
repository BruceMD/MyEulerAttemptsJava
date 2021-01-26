public class Problem12 {

    static void triangle(){
        int n = 1;
        while(true){
            if(countDivisors(triNum(n)) > 500){
                System.out.println(n);
                System.out.println(triNum(n));
                break;
            }
            n++;
        }
    }

    static Integer countDivisors(int num){

        int count = 0;
        for (int i = 1; i < Math.sqrt(num); i++){
            if (num % i == 0){
                count += 2;
            }
        }
        if (Math.sqrt(num) % 1 == 0){
            count ++;
        }
        return count;
    }


    static Integer triNum(int num){
        int count = 0;

        for (int i = 0; i < num + 1; i++){
            count += i;
        }
        return count;
    }
}
