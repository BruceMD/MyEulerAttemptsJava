public class Problem40 {

    static void champernowne(){

        String chamNum = chamGen();

        int chamNumInt = 1;

        for (int i = 0; i < 7; i++){
            chamNumInt *= Character.getNumericValue(chamNum.charAt((int)Math.pow(10, i)-1));
            System.out.println(chamNum.charAt((int)Math.pow(10, i)-1));
        }
        System.out.println(chamNumInt);
    }

    static String chamGen(){

        String num = "";
        int n = 1;
        while(num.length() < 1000001){
            num += String.valueOf(n);
            n++;
        }

        return num;
    }

}
