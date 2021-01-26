public class Problem7 {

//    static void check(){
//        for(int i = 2; i < 100; i++){
//            if(Problem3.isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }

    static Integer countPrime(){
        int num = 3;
        int count = 1;
        while(true){
            if (Problem3.isPrime(num)){
                count ++;
            }

            if (count == 10001){
                break;
            }
            num ++;
        }
        System.out.println(num);
        return num;
    }
}
