package math.problems;

public class Fibonacci {

    int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        Fibonacci obj = new Fibonacci();
        int n = 9;
        for (int i = 0; i <=n; i++){
            System.out.print(obj.fib(i)+ ", ");
        }



    }




    }

