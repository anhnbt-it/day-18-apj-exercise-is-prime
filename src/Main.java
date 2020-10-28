/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 1:50 PM
 */
public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(lazyPrimeFactorization);
        Thread t2 = new Thread(optimizedPrimeFactorization);
        t1.start();
        t2.start();
    }
}
