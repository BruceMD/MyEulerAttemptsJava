public class Problem10 {

    static Long sumPrime(){

        long sum = 2;

        for (int i = 3; i < 2000001; i += 2){
            if (Problem3.isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

}
