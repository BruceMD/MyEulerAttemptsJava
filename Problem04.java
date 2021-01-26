public class Problem4 {

    static Integer maxPal(){
        int m = 999;
        int n = 999;
        int max = 0;

        for (int i = 100; i < 1000; i++){
            for (int j = 100; j < 1000; j++){
                if (isPalindrome(i*j)){
                    if (i*j > max){
                        max = i*j;
                    }
                }
            }
        }
        System.out.println(max);
        return max;
    }

    static Boolean isPalindrome(int x){
        String s = String.valueOf(x);

        int ind = 0;
        while(ind < s.length()){
            if (s.charAt(ind) == s.charAt(s.length() - 1 - ind)){
                ind ++;
            }
            else {return false;}
        }
        return true;
    }

}
