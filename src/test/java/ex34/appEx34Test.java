package ex34;

import ex24.appEx24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appEx34Test {

    @Test
    void removeEmployee() {

        appEx34 app = new appEx34();

        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] answer = app.removeEmployee(employees, "Jackie Jackson");
        String[] proper = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        assertEquals(proper, answer);


    }
}