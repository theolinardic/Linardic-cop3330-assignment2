package ex36;

import ex34.appEx34;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appEx36Test {

    @Test
    void isInt_Test_true() {
        appEx36 app = new appEx36();
        boolean answer = app.isInt("1234");

        assertEquals(true, answer);
    }

    @Test
    void isInt_Test_false() {
        appEx36 app = new appEx36();
        boolean answer = app.isInt("123A");

        assertEquals(false, answer);
    }

    @Test
    void getStandardDeviation() {
    }
}