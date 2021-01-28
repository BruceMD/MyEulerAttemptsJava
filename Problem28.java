public class Problem28 {

    static void spiral(){

        long count = 1;

        for (int n = 3; n < 1002; n += 2){
            count += n*n;
            count += n*n - (n-1)*3;
            count += (n-1)*(n-1) + 1;
            count += n*(n-1) + 1;
        }

        System.out.println(count);
    }
}
