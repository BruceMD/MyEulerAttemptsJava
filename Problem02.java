public class Problem2 {

    static Integer fib(){
        int m = 1;
        int n = 2;

        int count = 0;

        while (true){
            if (m > 4000000 || n > 4000000){break;}
            if (m%2 == 0){count += m;}
            if (n%2 == 0){count += n;}
            m = m+n;
            n = m+n;
        }

        return count;
    }
}
