public class Problem39 {

    static void rightTri(){

        int count = 0;

        for (int p = 5; p < 1001; p++){
            int temp = pythag(p);
            if (temp > count){
                count = temp;
                System.out.println(p);
            }
        }

    }

    static Integer pythag(int num){
        int tally = 0;

        int c = 3;

        while (c < num - 2){
            int b = 0;
            while (b < c){
                int a = 0;
                while (a <= b){
                    if (a + b + c == num){
                        if (c*c == b*b + a*a){
                            tally++;
//                            System.out.println(c + " " + b + " " + a);
                        }
                    }
                    a++;
                }
                b++;
            }
            c++;
        }
        return tally;
    }

}
