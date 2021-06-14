package ex27;

import ex26.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appEx27Test {

    @Test
    void validateInput_Correct() {

        appEx27 app = new appEx27();
        // User enters note and tone to check if anagrams
        boolean answerFirstName = app.firstNameValidator("John");
        boolean answerLastName = app.lastNameValidator("Johnson");
        boolean answerZipCode = app.zipCodeValidator("55555");
        boolean answerID = app.employeeIDValidator("TK-4321");

        assertEquals(true, answerFirstName);
        assertEquals(true, answerLastName);
        assertEquals(true, answerZipCode);
        assertEquals(true, answerID);
    }

    @Test
    void validateInput_Wrong() {

        appEx27 app = new appEx27();
        // User enters note and tone to check if anagrams
        boolean answerFirstName = app.firstNameValidator("J");
        boolean answerLastName = app.lastNameValidator("");
        boolean answerZipCode = app.zipCodeValidator("ABCDE");
        boolean answerID = app.employeeIDValidator("A12-12343");

        assertEquals(false, answerFirstName);
        assertEquals(false, answerLastName);
        assertEquals(false, answerZipCode);
        assertEquals(false, answerID);
    }
}