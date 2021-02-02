public class Problem48 {

    static void powerDigits(){


        double sum = 0;

        for (int i = 1; i < 1001; i++){
            System.out.println(i);
            if (sum > 9999999999d){
                sum = sum % 10000000000d;
            }
            double temp = 1;
            for (int j = 0; j < i; j++){
                temp *= i;
                if (temp > 9999999999d){
                    temp = temp % 10000000000d;
                }
            }
            sum += temp;
        }

        System.out.printf("%.1f", sum);

    }
}
