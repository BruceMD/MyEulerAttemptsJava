public class Problem1 {

    public static void main(String[] args){

        System.out.println(method());

    }

    static Integer method(){
        Integer count = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
                count = count + i;
            }
        }
        return count;
    }
}
