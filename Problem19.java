public class Problem19 {

    static void countDays(){

        Integer[] year = year();
        Integer[] month = month();
        Integer[] day = day();              // 1 Jan 1901 = Tuesday, Tuesday = 1, Sunday = 6

        for (int y : year){
            for (int m : month){
                if ((m == 4 || m == 6) || (m == 9 || m == 11)){
                    
                }
            }
        }

    }

    static Integer[] year(){
        Integer[] m = new Integer[100];
        for (int i = 1901; i < 2001; i++){
            m[i-1901] = i;
        }
        return m;
    }

    static Integer[] month(){
        Integer[] m = new Integer[12];
        for (int i = 1; i < 13; i++){
            m[i-1] = i;
        }
        return m;
    }

    static Integer[] day(){
        Integer[] d = new Integer[7];
        for (int i = 1; i < 8; i++){
            d[i-1] = i;
        }
        return d;
    }

}
