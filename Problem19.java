public class Problem19 {

    static void countDays(){

        Integer[] year = year();
        Integer[] month = month();
        Integer[] day = day();              // 1 Jan 1901 = Tuesday, Tuesday = 1, Sunday = 6

        int count = 0;
        int dayTally = 6;

        for (int y : year){
            for (int m : month){
                int d;
                if ((m == 3 || m == 5) || (m == 8 || m == 10)){
                    d = 30;
                }
                else if (m == 1){
                    if (y % 100 == 0 && y % 400 != 0){
                        d = 28;
                    }
                    else if (y % 4 == 0){
                        d = 29;
                    }
                    else{
                        d = 28;
                    }
                }
                else {
                    d = 31;
                }
                for (int date = 0; date < d; date++){
                    if (date == 0 && day[dayTally] == 6){
                        count ++;
                        System.out.println("BANG");
                    }
                    dayTally ++;
                    if (dayTally > 6){
                        dayTally = 0;
                    }
                    printDate(y, m, date, dayTally);
 //                   System.out.println(dayTally + " " + day[dayTally]);
                }
            }
        }
        System.out.println(count);
    }

    static void printDate(int year, int month, int day, int dayOfWeek){

        String datePrint = "";

        if (dayOfWeek == 0){datePrint += "Tue";}
        else if (dayOfWeek == 1) {datePrint += "Wed";}
        else if (dayOfWeek == 2) {datePrint += "Thur";}
        else if (dayOfWeek == 3) {datePrint += "Fri";}
        else if (dayOfWeek == 4) {datePrint += "Sat";}
        else if (dayOfWeek == 5) {datePrint += "Sun";}
        else {datePrint += "Mon";}

        datePrint += " " + String.valueOf(day + 1);

        if (month == 0){datePrint += " " + "Jan ";}
        else if (month == 1){datePrint += " " + "Feb ";}
        else if (month == 2){datePrint += " " + "Mar ";}
        else if (month == 3){datePrint += " " + "Apr ";}
        else if (month == 4){datePrint += " " + "May ";}
        else if (month == 5){datePrint += " " + "Jun ";}
        else if (month == 6){datePrint += " " + "Jul ";}
        else if (month == 7){datePrint += " " + "Aug ";}
        else if (month == 8){datePrint += " " + "Sep ";}
        else if (month == 9){datePrint += " " + "Oct ";}
        else if (month == 10){datePrint += " " + "Nov ";}
        else {datePrint += " " + "Dec ";}

        datePrint += String.valueOf(year);

        System.out.println(datePrint);

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
        for (int i = 0; i < 12; i++){
            m[i] = i;
        }
        return m;
    }

    static Integer[] day(){
        Integer[] d = new Integer[7];
        for (int i = 0; i < 7; i++){
            d[i] = i;
        }
        return d;
    }

}
