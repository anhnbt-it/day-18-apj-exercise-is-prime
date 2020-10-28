import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 1:51 PM
 */
class LazyPrimeFactorizationTest {

    @Test
    @DisplayName("Is Prime 2")
    void testIsPrime2() {
        int number = 2;
        boolean expected = true;
        boolean actual = LazyPrimeFactorization.isPrime(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Is Prime 3")
    void testIsPrime3() {
        int number = 3;
        boolean expected = true;
        boolean actual = LazyPrimeFactorization.isPrime(3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Is Prime 4")
    void testIsPrime4() {
        int number = 4;
        boolean expected = false;
        boolean actual = LazyPrimeFactorization.isPrime(4);
        assertEquals(expected, actual);
    }

}