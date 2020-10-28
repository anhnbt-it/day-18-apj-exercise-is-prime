/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 1:36 PM
 */
public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        int i = 2;
        while (counter < 20) {
            if (isPrime(i)) {
                System.out.println(i + ": OptimizedPrime");
                counter++;
            }
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i < 1) {
                return false;
            }
        }
        return number > 1;
    }
}
