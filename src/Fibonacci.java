
public class Fibonacci {
    static int first=0,second=1,nextNum;


    public static void main(String[] args) {
        int n = 15;


        System.out.print(first + "," + second + ",");
        fib(n - 2);
    }
    //using iteration
//        for(int i=2;i<n;i++){
//            nextNum=first+second;
//            first=second;
//            second=nextNum;
//            System.out.print(nextNum+",");
//        }
    //Using recursion
        public static int fib(int n){
            if(n>0) {
                nextNum = first + second;
                first = second;
                second = nextNum;
                System.out.print(nextNum + ",");
                fib(n - 1);
            }
            return 0;


        }






}
