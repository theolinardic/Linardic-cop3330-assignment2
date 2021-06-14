package ex25;

import ex24.appEx24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appEx25Test {

    @Test
    void passwordValidator_Very_Weak_Case() {

        appEx25 app = new appEx25();
        // User enters note and tone to check if anagrams
        int answer = app.passwordValidator("12345");

        assertEquals(0, answer);
    }

    @Test
    void passwordValidator_Weak_Case() {

        appEx25 app = new appEx25();
        // User enters note and tone to check if anagrams
        int answer = app.passwordValidator("abcdef");

        assertEquals(1, answer);
    }

    @Test
    void passwordValidator_Strong_Case() {

        appEx25 app = new appEx25();
        // User enters note and tone to check if anagrams
        int answer = app.passwordValidator("abc123xyz");

        assertEquals(2, answer);
    }

    @Test
    void passwordValidator_Very_Strong_Case() {

        appEx25 app = new appEx25();
        // User enters note and tone to check if anagrams
        int answer = app.passwordValidator("1337h@xor!");

        assertEquals(3, answer);
    }
}