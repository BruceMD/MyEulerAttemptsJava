public class Problem5 {

    static Integer minMultiple(){
        int num = 1;
        while (true){
            if (isMultiple(num)){
                System.out.println(num);
                return num;
            }
            num ++;
        }
    }

    static boolean isMultiple(int x){
        for (int i = 1; i < 21; i++){
            if (x % i != 0){return false; }
        }
        return true;
    }
}
