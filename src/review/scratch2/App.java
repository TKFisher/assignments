package review.scratch2;

public class App {

    public static void main(String[] args) {

        System.out.println(func(3));
    }



    public static int func(int n) {

        if (n <= 1) {
            return 1;
        }
        return n * func(n - 1);
    }
}
