package ex26;

import ex25.appEx25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_test() {
        PaymentCalculator app = new PaymentCalculator();
        // User enters note and tone to check if anagrams
        int answer = app.calculateMonthsUntilPaidOff(5000, 0.000328767123, 100);

        assertEquals(70, answer);
    }
}