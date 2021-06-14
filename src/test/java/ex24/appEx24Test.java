package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appEx24Test {


    @Test
    void isAnagram_returns_true_for_anagrams() {
        appEx24 app = new appEx24();
        // User enters note and tone to check if anagrams
        boolean answer = app.isAnagram("note", "tone");

        assertEquals(true, answer);
    }

    @Test
    void isAnagram_returns_false_for_not_anagrams() {
        appEx24 app = new appEx24();
        // User enters note and tone to check if anagrams
        boolean answer = app.isAnagram("note", "coke");

        assertEquals(false, answer);
    }

}