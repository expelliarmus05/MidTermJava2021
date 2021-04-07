package math.problems;


public class Factorial {

    int fac(int n){
        if(n == 0){
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Factorial obj = new Factorial();
        int n = 5;
        System.out.println(obj.fac(n));

    }
}
